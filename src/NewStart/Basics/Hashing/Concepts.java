package NewStart.Basics.Hashing;


import java.util.Scanner;

public class Concepts {
    public static int countElements (int [] arr , int num) {
        int count =0;
        for(int i = 0 ;i < arr.length ; i++) {
            if(arr[i] == num) {
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elemets");
        for(int i = 0 ; i < n ; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of queries");

        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the number to search");
            System.out.println(q);
            int num = sc.nextInt();
            System.out.println(countElements(arr , num) + " ans");
            q--;
        }

//        for(var el : arr) {
//            System.out.println(el);
//        }
    }
}
