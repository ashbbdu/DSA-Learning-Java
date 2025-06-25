package NewStart.Advance.Arrays.Medium_FAQS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInAnArray {
    public static ArrayList<Integer> leadersOptima(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = nums[nums.length - 1];
        arr.add(nums[nums.length - 1]);
        for(int i = nums.length - 2 ; i >= 0 ; i--) {

            if(nums[i] > max) {
                arr.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(arr);
        return arr;
    }

    public static ArrayList<Integer> leadersBrute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();



        for(int i = 0 ;  i < nums.length ; i++) {
            boolean flag = true;
            for(int j = i+1 ;  j< nums.length; j++) {
                if(nums[i] < nums[j]) {
                    flag = false;
                    break;
                }

            }
            if(flag) arr.add(nums[i]); // if flag is tru add that number into arr

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {-3, 4, 5, 1, -4, -5};
//        int[] arr = {
//                946, 978, 781, 472, 738, 705, 457, 152, 659, 238,
//                132, 739, 992, 699, 903, 903, 330, 600, 696, 671,
//                952, 714, 608, 346, 182, 956, 582, 924, 850, 705,
//                835, 426
//        };
        System.out.println(leadersOptima(arr));

        int [] brr = { 946, 978, 781, 472, 738, 705, 457, 152, 659, 238,
                132, 739, 992, 699, 903, 903, 330, 600, 696, 671,
                952, 714, 608, 346, 182, 956, 582, 924, 850, 705,
                835, 426};
        System.out.println(leadersBrute(brr));
    }
}
