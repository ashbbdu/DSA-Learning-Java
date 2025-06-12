package NewStart.Advance.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {7, 4, 1, 5, 3};

        for(int i = 0 ; i < arr.length - 1 ;i++) {
            int mini = i;
            for(int j = i+1 ; j < arr.length  ; j++) {
                if(arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }


        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
