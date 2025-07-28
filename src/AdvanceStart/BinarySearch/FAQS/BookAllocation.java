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
        return  low;
    }

    public static int findPagesOptimal(int[] nums, int m) {
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
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(countStudents(nums , mid ) <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr = {462,450,652,363,96,968,493,947,669,559,758,924,931,621,334,942,724,521,227,216,781,189,758,215,278,692,125,621,281};
        int m = 22;
        System.out.println(findPages(arr, m));
        System.out.println(findPagesOptimal(arr, m));
    }
}
