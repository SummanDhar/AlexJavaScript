import java.util.Scanner;

public class factorialTrailingzero {
    public static int trailingZero(int n){
        int cnt = 0;
        while(n>0){
            n /= 5;
            cnt+=n;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n =sc.nextInt();
        System.out.println("Number of trailing zero: ");
        System.out.print(trailingZero(n));
        sc.close();
    }
}
