package AdvanceStart.Arrays.LogicBuilding;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    public static int [] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i =0;
        int j =0;


        while(i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;

            }
            else { // num1[i] > nums[2]
                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums2[j]) {
                    ans.add(nums2[j]);
                }
                j++;
            }


        }

        //            add remaining items
        while (j < n2) {
            if(ans.isEmpty() || ans.get(ans.size() - 1) != nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }

        while (i < n1) {
            if(ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }
        int[] Union = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            Union[k] = ans.get(k);
        }

        return Union;
    }
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 2, 7};
        System.out.println(unionArray(arr1 , arr2));
    }
}
