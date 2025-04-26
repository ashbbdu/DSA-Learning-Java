package Advance.Arrays.Fundamentals;

public class LeftRotateArray {
    public static void leftRotateByK (int [] arr , int k) {
        int n = arr.length;
        k = k % n;
        int temp [] = new int[k];
//        insert elements into the temp array

        for(int i = 0 ; i < temp.length  ; i++) {
            temp[i] = arr[i];
        }

//        for(int i = k ; i < n ; i++) {
//            arr[i - k] = arr[i];
//        }
//


// Copy back the k elements at the end
//        for(int i = 0 ; i < k ; i++ ) {
//            arr[n - k + i] = temp[i];
//        }

        for(int i = k ; i < n ; i++) {
            arr[i - k] = arr[i];
        }

        for(int i = 0 ;  i < k ; i++) {
            arr[n - k + i] = temp[i];
        }

    }

//    public void rotateArray(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n;
//        int [] temp = new int [k];
//
//        for(int i = 0 ; i < k ; i++) {
//            temp[i] = arr[i];
//        }
//
//        // shifting elements to the start
//        for(int i = k ; i < n ; i++) {
//            arr[i - k] = arr[i];
//        }
//
//        // append the temp array at the last
//        for(int i = 0 ; i < k ; i++) {
//            arr[n - k + i] = temp[i];
//        }
//
//    }


    public static void rightRotate (int [] arr , int k ) {
        int n = arr.length;
        k = k % n;
//        {1,2,3,4,5,6,7}
        int [] temp = new int[k];

        for(int i = 0  ; i < temp.length ; i++) {
            temp[i] = arr[n - k + i];
        }


        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for(int i = 0 ;  i < k ; i++) {
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int arr [] =  {1,2,3,4,5,6,7};
        int k = 3;
        leftRotateByK(arr ,k );
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int brr [] =  {1,2,3,4,5,6,7};
        rightRotate(brr , 4);
        for(var a : brr) {
            System.out.print(a + " ");
        }
    }
}
