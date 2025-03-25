package BasicArrays;

public class ArrayConcept {
    public static void main(String[] args) {
        int arr[] = {1,2,3 , 4, 5};
//        System.out.println(arr.length);

//        for(int i = arr.length  - 1;  i >= 0 ; i--) {
//            System.out.print(arr[i] + " ");
//        }
        int n =5;
        int[] ans = new int[5];
        for(int i = 0 ; i < n ; i++) {
            ans[n - i - 1] =  arr[i];
        }

        for(int i = 0 ; i < n ; i++) {
            System.out.print(ans[i] + " ");
        }

//        System.out.println();
//
//        ans[4] = 10;
//        System.out.println(ans[4]);

    }
}
