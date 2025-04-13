package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
//        Do a dry run in copy , code + concept
        int[] arr = {7 ,4 ,1 ,5 ,3};
        int n = arr.length;
        for(int i = 0 ; i < n  - 1  ; i++) {
            boolean isSwapped = false;
            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }


        for(int i = 0 ; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
