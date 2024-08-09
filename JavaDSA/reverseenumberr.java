public class reverseenumberr {
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number1 = 302;
        int number2 = 231;
        System.out.println("Reversed number of " + number1 + ": " + reverseNumber(number1));
        System.out.println("Reversed number of " + number2 + ": " + reverseNumber(number2));
    }
}