package Advance.Arrays.Fundamentals;

import java.util.HashSet;
import java.util.Set;

public class LeftRotateArray {
    public static void leftRotateByK (int [] arr , int k) {
        int n = arr.length;
        k = k % n;
        int temp [] = new int[k];
//        insert elements into the temp array

        for(int i = 0 ; i < temp.length  ; i++) {
            temp[i] = arr[i];
        }

        for(int i = k ; i < n ; i++) {
            arr[i - k] = arr[i];
        }

        for(int i = 0 ;  i < k ; i++) {
            arr[n - k + i] = temp[i];
        }

    }

    public static void reverse (int [] arr , int start , int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateByKOptimal (int [] arr , int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr , 0 , k -1);
        reverse(arr , k , n - 1);
        reverse(arr , 0 , n-1);
    }

    public static void rightRotate (int [] arr , int k ) {
        int n = arr.length;
        k = k % n;
        int [] temp = new int[k];


    }


    public static void moveZeroes(int[] nums) {
//        very brute force approach , hahah
        int n = nums.length;
        int count = 0;
        int nonZeroCount = 0;
        int c = 0;
        int d = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                nonZeroCount++;
            }
        }


        int [] temp = new int[count];
        int [] nonZeroTemp = new int[nonZeroCount];

        System.out.println(count + " " + nonZeroCount);

        for(int i = 0 ; i < nums.length; i++ ) {
            if(nums[i] == 0) {
                temp[c++] = nums[i];
             }
        }


        for(int i = 0 ; i < nums.length; i++ ) {
            if(nums[i] != 0) {
                nonZeroTemp[d++] = nums[i];
            }
        }



        for(int i = 0 ;i < nonZeroTemp.length ; i++) {
            nums[i] = nonZeroTemp[i];
        }

        for(int i = 0 ; i < temp.length ; i++) {
            nums[nonZeroTemp.length + i] = temp[i];
        }

    }



    public static void moveZeroesOptimal(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

//        inserrt 0 ;
//        we can also use while loop here
        for(int i = j ; i < n ; i++) {
            nums[i] = 0;
        }
    }


    public static void main(String[] args) {
//        int arr [] =  {1,2,3,4,5,6,7};
//        int k = 4;
//        leftRotateByK(arr ,k );
//        for(int i = 0 ; i < arr.length ; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        int brr [] =  {1,2,3,4,5,6,7};
//        rightRotate(brr , 15);
//        System.out.println();
////        for(var a : brr) {
////            System.out.print(a + " ");
////        }
//        System.out.println();
//
//        int crr[] = {1,2,3,4,5,6,7};
//                leftRotateByKOptimal(crr , 4);
//        for(int i = 0 ; i < crr.length ; i++) {
//            System.out.print(crr[i]+ " ");
//        }

//        Move all zeros to end of an array
        int [] drr = {0,1,2,4,0,5,0,1,0,0};
        moveZeroes(drr);
        for(var  el : drr) {
            System.out.print(el + " ");
        }
        System.out.println();
        int [] err = {0, 0, 3, 3, 5, 6};
        moveZeroesOptimal(err);

        for(var  el : err) {
            System.out.print(el + " ");
        }
        System.out.println();
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0 ; i < err.length ; i++) {
            st.add(err[i]);
        }
        System.out.println(st.size());
    }
}
