package BasicHashing;

public class HashingConcepts {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 6, 9, 6};
        int [] hashArr = new int[10];
        for(int i = 0 ; i < arr.length ; i++) {
            hashArr[arr[i]]++;
        }

//        for(var num : arr) {
//            hashArr[num]++;
//        }

        System.out.println(hashArr[5]);
    }
}
