package AdvanceStart.BinarySearch.LogicBuilding;

import java.util.ArrayList;
import java.util.Map;

public class FindRotationCountInARotatedArray {
    public static int findKRotationBrute(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0 ; i < nums.size() ; i++) {
            if(nums.get(i) < min) {
                min = nums.get(i);
               index =  i;
            }
        }
        return index;
    }

    public static int findKRotationOptimal(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size() - 1;
        int mid = start + (end  - start) / 2;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while(start <= end) {
            if(nums.get(start) <= nums.get(mid)) {
               if(nums.get(start) < min) {  // actully implemeting Math.min
                   index = start;
                   min = nums.get(start);
               }
            start = mid + 1;
            } else {
                if(nums.get(mid) < min) {
                    index = mid;
                    min =  nums.get(mid);
                }
                end = mid - 1;
            }
            mid = start + (end  - start) / 2;
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr = {4, 5, 1, 2};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            al.add(arr[i]);
        }
        System.out.println(findKRotationBrute(al));
        System.out.println(findKRotationOptimal(al));
    }
}
