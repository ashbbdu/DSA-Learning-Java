package NewStart.Advance.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {7, 4, 1, 5, 3};
        int n = arr.length; //5
//        for(int i = n - 1 ; i >= 1 ; i--) {
//            for(int j = 0 ; j < n - 1  ; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < n - 1; i++) {  // the outer loop controls how many passes we have to make to sort the array
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
