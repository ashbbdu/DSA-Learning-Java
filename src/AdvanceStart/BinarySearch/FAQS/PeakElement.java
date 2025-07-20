package AdvanceStart.BinarySearch.FAQS;

public class PeakElement {
    public static int findPeakElementBrute(int[] arr) {
        int n = arr.length;

//        for(int i  = 0 ; i < n ; i++) {
//
//            if((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1  || arr[i] > arr[i+1]) ) {
//                return i;
//            }
//        }
        if (n == 1) return 0;
        if(arr[0] > arr[1]) {
            return 0;
        }
        if(arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        for(int i  = 1 ; i < n - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static int findPeakElementOptimal(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if(arr[0] > arr[1]) {
            return 0;
        }
        if(arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        int start = 1;
        int end = n -2;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
//        int [] arr = {1, 2, 4, 8, 10};
        System.out.println(findPeakElementBrute(arr));
        System.out.println(findPeakElementOptimal(arr));
    }
}
