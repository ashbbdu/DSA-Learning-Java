import java.util.Arrays;

public class Test {
    public static int checkSecondLargest (int [] nums) {
        Arrays.sort(nums);
        int secondLargest = -1;
        for(int i = nums.length - 1;  i > 0 ; i-- ) {
            if(nums[i] != nums[i - 1]) {
                secondLargest = nums[i - 1];
                break;
            }
        }

        return  secondLargest;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(n);

        int[] arr = {5, 4, 3, 2, 1};
        int[] newArr = Arrays.copyOf(arr, arr.length);

        // Reverse the copy
        for (int i = 0; i < newArr.length / 2; i++) {
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length - 1 - i];
            newArr[newArr.length - 1 - i] = temp;
        }


        for(var val : newArr) {
            System.out.println(val);
        }

        String str = "ashish";
//        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.charAt(1) + '0');
        int a = 's';
        System.out.println(a);
        System.out.println('s' +  0);


        String ash = "Ashish";
        String right = ash.substring(0 , 1);
        System.out.println(right);

        int [] crr = {4,1,5,3,5,5 ,4,4,6};
        int [] drr = {2};
//        Arrays.sort(crr);
//        for (var c : crr) {
//            System.out.print(c + " ");
//        }

        int ans = checkSecondLargest(crr);
        int an = checkSecondLargest(drr);
        System.out.println(ans + " ans");
        System.out.println(an + " an");
    }
}
