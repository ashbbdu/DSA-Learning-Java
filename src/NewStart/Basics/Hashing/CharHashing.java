package NewStart.Basics.Hashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        char [] arr = new char[n];
        for(int i = 0 ;  i < n ; i++) {
            arr[i] = sc.next().charAt(0);
        }
//        char [] hashArr = new char[123];
        char [] hashArr = new char[26];
        for(var el : arr) {
//            hashArr[el]++;
            hashArr[el - 'a']++;
        }
        System.out.println((int)hashArr['c' - 'a'] + " ans");
    }
}
