package NewStart.Advance.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {7, 4, 1, 5, 3};
//        do dry run of this code in office
        for(int i = 0; i < arr.length ; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
