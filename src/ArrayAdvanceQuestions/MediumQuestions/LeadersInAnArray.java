package ArrayAdvanceQuestions.MediumQuestions;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        int [] arr = {737,344,561,65,885,18,131,27,335,90,267,336,375,157,548,698,273,342,275,107,561,930,747,383,486,92,242,758,782,594,86,688,978,824,964,497,524,659,114,880,958,280,195,235,341,838,403,573,686,922,388,403,864,722,688,443,714,259,399,93,590,150,652,958,854,289,123,539,782,547,494,132,306,626,761,369,913,480,602};
        System.out.println(leadersBrute(arr));;
    }
}
