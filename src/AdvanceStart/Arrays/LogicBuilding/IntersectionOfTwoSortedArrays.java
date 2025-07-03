package AdvanceStart.Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int [] visited = new int[n1];
        for(int i = 0 ; i < n1 ; i++) {
            for(int j = 0 ; j < n2 ; j++) {
                if(nums1[i] == nums2[j] && visited[j] == 0) {
                    ans.add(nums2[j]);
                    visited[j] = 1;
                    break;
                } else if (nums2[j] > nums1[i]) {
                    break;
                }
            }
        }
        int[] ansArr = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            ansArr[k] = ans.get(k);
        }
        return ansArr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};
       int [] ans =  intersectionArray(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
