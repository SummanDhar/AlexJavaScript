import java.util.Scanner;

public class palindromtwoo {
    public static boolean isPalindrom(int x){
        if(x < 0 || (x!=0 && x%10 == 0)){
            return false;
        }
        int reverse = 0;
        //int original = x;
        while(x > reverse){
            reverse = reverse*10 + x % 10;
            x /= 10;
        }
        return (x == reverse) || (x == reverse/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.println(isPalindrom(x));
        sc.close();
    }

}
