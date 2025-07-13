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


//        Char hashing

        String name = "aashish";
        int[] freq = new int[26]; // for 'a' to 'z'

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c + " c");
            freq[c - 'a']++; // subtract 'a' to get index 0-25
        }

        System.out.println("Frequency of 'a': " + freq['a' - 'a']); // prints 1
        System.out.println("Frequency of 's': " + freq['s' - 'a']); // prints 2
    }
}
