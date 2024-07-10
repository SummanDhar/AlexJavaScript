package JavaDSA;
import java.util.*;

public class maximunSubArraySum{
    public int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currSum  = nums[0];

        for(int i = 1 ; i<nums.length;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum =Math.max(maxSum,currSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of eement:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter element");
        for(int i =0 ;i<n ;i++){
            nums[i] = sc.nextInt();

        }
        maximunSubArraySum solution = new maximunSubArraySum();
        int maxSum = solution.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
        
        sc.close();
    }

}