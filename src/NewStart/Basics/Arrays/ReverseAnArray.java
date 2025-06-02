package NewStart.Basics.Arrays;

public class ReverseAnArray {


    public static void reverseArrayRecursion (int [] arr , int start , int end) {
//        using recurssion
        while(start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursion(arr , start+1 , end - 1);
    }


    public static void reverseArray (int [] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverseArray(arr);
        for(var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        int [] brr = {1,2,3,4,5};
        int start = 0;
        int end = brr.length -1;
        reverseArrayRecursion(brr , start , end);
        for(var el : brr) {
            System.out.print(el + " ");
        }
    }
}
