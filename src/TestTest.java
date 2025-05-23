public class TestTest {

    public static void rotateByK (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
//        create a temp arr
        int [] temp = new int[k];
//        fill the last k elem into the temp array
        for(int i =  0 ;  i < k ; i++) {
            temp[i] = nums[i];
        }

//        shift the elements of the main array to starting position
        for(int i = k ; i < n ; i++) {
            nums[i - k] = nums[i];
        }

//        merge the temp array in main array
        for(int i = 0 ; i < k ; i++) {
            nums[n - k + i] = temp[i];
        }
    }

    public static void rotateRightByK (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int [k];
        for(int i = 0 ; i < k ; i++) {
            temp[i] = nums[n - k + i];
        }

//    shift the elements
        for(int i = n - 1 ; i >= k ; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

    }


    public static void rotateLeftByK (int [] nums , int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];
        for(int i = 0 ; i < k ; i++) {
            temp[i] = nums[i];
        }

        for(int i = k ; i < n ; i++) {
            nums[i - k] = nums[i];
        }

//        merge the temp array to main array;
        for(int i = 0 ; i < k ; i++) {
            nums[n - k + i] = temp[i];
        }

    }


    public static void rotateRightByK1 (int [] nums , int k) {
        int n = nums.length;
        k = k % n;

        int [] temp = new int[k];

        for(int i = 0 ; i < k ; i++) {
            temp[i] = nums[n - k + i];
        }

        for(int i = n -1 ; i >= k ; i--) {
            nums[i] = nums[i - k];
        }

//        merging
        for(int i = 0 ; i < k ; i++) {
            nums[i] = temp[i];
        }

    }




    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        rotateByK(arr , 2);

        for(var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        int [] brr = {1, 2, 3, 4, 5, 6};
        rotateRightByK(brr , 2);

        for(var el : brr) {
            System.out.print(el + " ");
        }

        int [] crr = {3, 4, 1, 5, 3, -5};
        rotateLeftByK(crr , 8);
        System.out.println("crrr");
        for(var el : crr) {
            System.out.print(el + " ");
        }

        System.out.println("Rotate right by K 1");

        int [] drr = {1, 2, 3, 4, 5, 6};
        rotateRightByK1(drr , 2);

        for(var el : drr) {
            System.out.print(el + " ");
        }
    }
}
