import java.util.Scanner;

public class sumofevennumber {
    public static int SumOfEvenNumber(int[] nums){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of element: ");
       int n  = sc.nextInt();
       int[] num = new int[n];
       System.out.println("Enter digit one by one: ");
       for(int i = 0 ; i<n ;i++){
        num[i] = sc.nextInt();
       }
       int res = SumOfEvenNumber(num);
       System.out.println("Sum of Even number is: " + res);
       sc.close();
       }

    }

