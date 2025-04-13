package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7 ,4 ,1 ,5 ,3};
        int n = arr.length;
// Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for(int i = 0 ; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
