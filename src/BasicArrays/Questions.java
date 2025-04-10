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


//    public static void revArrBrute (int [] arr) {
//        for(int i = 0 ; i < arr.length ; i++) {
//           arr[i] = arr[arr.length - 1] - i;
//        }
//    }

    public static void revArrOptimal (int [] arr) {
//        two pointer approach
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int size = arr.length;
        System.out.println(sumofarray(arr));
        System.out.println(countOdd(arr , size));
//        revArrBrute(arr);

        revArrOptimal(arr);


        for(int i = 0;i < arr.length ;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
