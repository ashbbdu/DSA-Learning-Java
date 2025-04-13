package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {5, 6, 5, 6, 9, 6};
        int[] arr = {7 ,4 ,1 ,5 ,3};
        int n = arr.length;

//        for (int i = 0 ; i < n - 1 ; i++) {
//            int mini = i;
//            for(int j = i +1  ; j <= n -1  ; j++) {
//                if(arr[mini] > arr[j]) {
//                    mini  = j;
//                }
//
//            }
////            do the swapping
//            int temp = arr[i];
//            arr[i] = arr[mini];
//            arr[mini] = temp;
//        }
//        for(int i = 0 ; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }


        for(int i = 0 ; i < n - 1 ; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j <= n - 1  ; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
//            do the swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println();
        System.out.println("Another function");
        for(int i = 0 ; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
