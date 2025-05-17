package PracticeQuestionsMisc;

public class SecondLargestElemetArray {
    public static int secondLargestBetter (int [] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(n < 2) {
            return  -1;
        }
        for(int i = 0 ; i < n ; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        for(int i = 0 ; i < n ; i++) {
            if(secondLargest < arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static void main(String[] args) {
        int [] arr = {10, 10, 10, 10, 10};
        System.out.println(secondLargestBetter(arr));
        int [] brr = {-235,-535,-457,-35,-568,-456,-3};
        System.out.println(secondLargestBetter(brr));
    }
}
