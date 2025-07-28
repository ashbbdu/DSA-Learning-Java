package AdvanceStart.BinarySearch.FAQS;

public class BookAllocation {
    public static int countStudents(int[] nums, int pages) {
    // Size of array
        int n = nums.length;
        int currentPagesCount = 0;
        int totalStudents = 1; // why initially the totalStudent is 1 and not 0
        for(int i = 0 ; i < n ; i++) {
            if(currentPagesCount + nums[i] <= pages) {
                currentPagesCount = currentPagesCount + nums[i];
            } else {
                totalStudents++;
                currentPagesCount = nums[i];
            }
        }
        return totalStudents;
}

    public static int findPages(int[] nums, int m) {
        int n = nums.length;

        // Book allocation impossible
        if (m > n) return -1;

        // Calculate the range for search
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < n; i++){
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }

        for(int i = low ;  i <= high ; i++) {
            if(countStudents(nums , i ) == m) {
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {713,351,266,908,224,168,591,851,369,709,655,831,970,356,538,609,149,820,393};
        int m = 10;
        System.out.println(findPages(arr, m));
    }
}
