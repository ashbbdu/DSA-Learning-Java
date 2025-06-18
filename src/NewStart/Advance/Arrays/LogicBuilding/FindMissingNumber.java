package NewStart.Advance.Arrays.LogicBuilding;

import java.util.TreeSet;

class Sol {
    public int findMissingNumberBrute(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i <= n ; i++) {
            int flag = 0;
            for(int j = 0 ; j < n ; j++) {
                if(nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return  -1;
    }

}
public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 5, 6};
        Sol s = new Sol();
        System.out.println(s.findMissingNumberBrute(arr));
    }
}
