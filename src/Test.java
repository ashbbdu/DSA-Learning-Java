import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(n);

        int[] arr = {5, 4, 3, 2, 1};
        int[] newArr = Arrays.copyOf(arr, arr.length);

        // Reverse the copy
        for (int i = 0; i < newArr.length / 2; i++) {
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length - 1 - i];
            newArr[newArr.length - 1 - i] = temp;
        }


        for(var val : newArr) {
            System.out.println(val);
        }

        String str = "ashish";
//        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.charAt(1) + '0');
        int a = 's';
        System.out.println(a);
        System.out.println('s' +  0);

    }
}
