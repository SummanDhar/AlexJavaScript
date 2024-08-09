import java.util.Scanner;

public class nextsmallestprimenumber {
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        if(num % 2 ==0 || num % 3 == 0) return false;
        for(int i = 5 ; i*i < num ;i+=6){
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    } 
    public static int smallestPrimeNumber(int N){
        int num = N+1;
        while(!isPrime(num)){
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int N = sc.nextInt();
        int output=smallestPrimeNumber(N);
        System.out.println("Smallest Prime number larger than given number is: " + output);
        //System.out.println();
        sc.close();
    }
    
}
