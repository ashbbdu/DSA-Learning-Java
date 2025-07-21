package AdvanceStart.BinarySearch.FAQS;

public class BookAllocation {
    public static int countStudents(int[] nums, int pages) {
    // Size of array
    int n = nums.length;
    int pagesStudent = 0;
    int student = 1;
    for(int i = 0 ;  i < n ; i++) {
        if(pagesStudent + nums[i] <= pages) {
            pagesStudent = pagesStudent + nums[i];
        } else {
            student++;
            pagesStudent = nums[i];
        }
    }
return student;
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

        for (int pages = low; pages <= high; pages++) {
            if (countStudents(nums, pages) == m) {
                return pages;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;
        System.out.println(findPages(arr, m));
    }
}
