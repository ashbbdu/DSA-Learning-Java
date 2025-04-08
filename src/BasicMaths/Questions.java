package BasicMaths;

public class Questions {
    public static int countdigitsofanumber (int num) {
        if(num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count = count+1;
            num = num/10;
        }
        return count;
    }

    public static int countOddDigit (int num) {

    }
    public static void main(String[] args) {
        System.out.println(countdigitsofanumber(1213234343));
    }
}
