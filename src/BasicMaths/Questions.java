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
        int oddCount = 0;
        if(num == 0) return 1;
        while (num > 0) {
            int rem = num % 10;
            if(rem % 2 != 0) {
                oddCount = oddCount + 1;
            }
            num = num /10;
        }
        return oddCount;
    }
    public static void main(String[] args) {
        System.out.println(countdigitsofanumber(1213234343));
        System.out.println(countOddDigit(1357));
    }
}
