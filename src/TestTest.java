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

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        rotateByK(arr , 2);

        for(var el : arr) {
            System.out.print(el + " ");
        }
    }
}
