package BasicArrays;

public class FindaSortedArrayAscedning {
   static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 0; i < n - 1 ; i++) {
            //    for(int j = i + 1 ; j < n ; j++) {
            //  if(arr[i] > arr[j]) {
            //     return false;
            // }
            //    }
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3 , 4, 5};
        boolean ans = arraySortedOrNot(arr , 5);
        System.out.println(ans);
    }
}
