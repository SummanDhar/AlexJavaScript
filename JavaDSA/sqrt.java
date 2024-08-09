import java.util.Scanner;

public class sqrt {
    public static int SqrtOfAnumber(int x){
        if(x==0 || x==1){
            return x;
        }
        int start = 1;
        int end = x;
        int mid = -1;

        while(start<= end){
            mid = start + (end-start)/2;
            if((long) mid*mid > (long) x){
                end = mid-1;
            }else if(mid*mid == x){
                return mid;
            }else{
                start = mid+1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int res = SqrtOfAnumber(n);
        System.out.println("Sqrt of this number is:" + res);
        sc.close();
    }
}
