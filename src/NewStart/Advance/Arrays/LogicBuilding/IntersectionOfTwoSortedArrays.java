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
        return ansList;

    }
    public static int[] intersectionArrayOptimal(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) { // jaise bhi koi bhi n or m k upar jaegi loop will break
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            }
            else if(nums1[i] == nums2[j]) {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] ansList = new int[ans.size()];
        for(int k = 0 ; k < ans.size() ; k++) {
            ansList[k] = ans.get(k);
        }
        return ansList;
    }
    public static int[] intersectionBurtePractice(int[] nums1, int[] nums2) {
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
                } else if(nums1[i] < nums2[j]) {
                    break;
                }
            }
        }
        int [] ansList = new int[ans.size()];
        for(int k = 0 ; k < ans.size() ; k++) {
            ansList[k] = ans.get(k);
        }
        return ansList;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,5,6,10,12,13,13,16,17,18,19,20,22,22,23,25,25,27,27,27,28,29,32,34,43,45,46,49,50};
        int[] nums2 = {3,3,5,6,6,9,10,13,14,15,15,15,15,17,19,20,21,21,22,27,30,32,36,37,38,38,40,44,45,45,46,47,48,49,49};
        int[] ans = intersectionArrayBrute(nums1, nums2);
        System.out.println(Arrays.toString(ans));

        int[] nums3 = {2,5,6,10,12,13,13,16,17,18,19,20,22,22,23,25,25,27,27,27,28,29,32,34,43,45,46,49,50};
        int[] nums4 = {3,3,5,6,6,9,10,13,14,15,15,15,15,17,19,20,21,21,22,27,30,32,36,37,38,38,40,44,45,45,46,47,48,49,49};

        int[] ans1 = intersectionArrayOptimal(nums3, nums4);
        System.out.println(Arrays.toString(ans1));
        int[] nums5 = {2,5,6,10,12,13,13,16,17,18,19,20,22,22,23,25,25,27,27,27,28,29,32,34,43,45,46,49,50};
        int[] nums6 = {3,3,5,6,6,9,10,13,14,15,15,15,15,17,19,20,21,21,22,27,30,32,36,37,38,38,40,44,45,45,46,47,48,49,49};
        int[] ans2 = intersectionBurtePractice(nums5 ,nums6);
        System.out.println(Arrays.toString(ans2));
    }
}
