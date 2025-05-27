package ArrayAdvanceQuestions.MediumQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    public static ArrayList<Integer> leadersBrute(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++) {
            boolean leader = true ;
            for(int j = i+1 ;  j < nums.length ; j++) {
                if(nums[i] <= nums[j]) {
                    leader = false;
                    break;
                }
            }
            if(leader == true) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }


    public static ArrayList<Integer> leadersOptimal(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums.length == 0) {
            return ans;
        }

        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            if(nums[i] > max) {
                max = nums[i];
                ans.add(nums[i]);
            }
        }

        Collections.reverse(ans);

        return ans;
    }




    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 3, 1, 2};
        System.out.println(leadersBrute(arr));;

        System.out.println(leadersOptimal(arr));
    }
}
