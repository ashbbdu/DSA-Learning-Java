package NewStart.Advance.Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static int[] intersectionArrayBrute(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int [] visited = new int[m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(nums1[i] == nums2[j] && visited[j] == 0) {
                    ans.add(nums1[i]);
                    visited[j] = 1;
                    break;
                } else if (nums1[i] < nums2[j]) {
                    break;
                }
            }
        }
        int [] ansList = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++) {
            ansList[i] = ans.get(i);
        }
        System.out.println(ans);
        return ansList;

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8 , 10, 11, 12 ,13};
        int[] ans = intersectionArrayBrute(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
