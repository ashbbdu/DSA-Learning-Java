package NewStart.Basics.Recursion;

import java.util.ArrayList;

public class CheckSortedArray {
    public static boolean checkSorted(ArrayList<Integer> nums , int i , int j) {
        if(nums.size() <= j ) {
            return true;
        }

        if (nums.get(i) > nums.get(j)) {
            return false;
        }

       return checkSorted(nums , i + 1 , j +1);
    }
    public static boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() <= 1) {
            return true;
        }
        return checkSorted(nums , 0 , 1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(isSorted(al));
    }
}
