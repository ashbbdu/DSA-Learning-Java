package AdvanceStart.BinarySearch.LogicBuilding;

import java.util.ArrayList;

public class FindMinInRotatedSortedArray {
    public static int findMinBrute(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.size() ; i++) {
            if(min > arr.get(i)) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static int findMinOptima(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        int min = Integer.MAX_VALUE;
        int mid = start + (end - start) / 2;
        while(start <= end) {
            if(arr.get(start) <= arr.get(mid)) {
//                means the array's left part is sorted
                min = Math.min(min , arr.get(start));
                start = mid + 1;
            } else {
//                means the right part is sorted
                min = Math.min(min , arr.get(mid));
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int [] arr = {3, 4, 5,0, 1, 2};
        for(var el : arr) {
            al.add(el);
        }
        System.out.println(findMinBrute(al));
        System.out.println(findMinOptima(al));

    }


}
