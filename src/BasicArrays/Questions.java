package BasicArrays;

public class Questions {
    public static int sumofarray (int [] arr) {
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int countOdd(int[] arr, int n) {
        int oddCount =0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % 2 != 0) {
                oddCount = oddCount + 1;
            }
        }
        return oddCount;
    }


    public static void revArrBrute (int [] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
           arr[i] = arr[arr.length - 1] - i;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int size = arr.length;
        System.out.println(sumofarray(arr));
        System.out.println(countOdd(arr , size));
        revArrBrute(arr);
        System.out.println(arr[0]);

        for(int i = 0;i < arr.length ;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
