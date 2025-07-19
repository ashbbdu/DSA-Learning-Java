package AdvanceStart.BinarySearch.FAQS;

public class PeakElement {
    public static int findPeakElementBrute(int[] arr) {
        int n = arr.length;
        for(int i  = 0 ; i < n ; i++) {

            if((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1  || arr[i] > arr[i+1]) ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int [] arr = {1, 2, 4, 8, 10};
        System.out.println(findPeakElementBrute(arr));
    }
}
