package NewStart.Basics.Hashing;

import java.util.Scanner;

public class HasingWithHashTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
//        compute max
        for(int i = 0 ; i < n ; i++) {
            max = Math.max(arr[i] , max);
        }

        int[] hashTable = new int[max+1];
        for(var el : arr) {
            hashTable[el]++;
        }

        System.out.println(hashTable[6] + " times it appears int the array");
    }
}
