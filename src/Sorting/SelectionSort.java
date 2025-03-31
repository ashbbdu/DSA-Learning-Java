package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 6, 9, 6};
        int[] hashTable = new int[10];
        for (int num : arr) {
            hashTable[num]++;
        }
        System.out.println(hashTable[6]);  // Output: 3
    }
}
