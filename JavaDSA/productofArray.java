import java.util.Arrays;

public class productofArray {
    public  int[] productOfArrayExceptSelf(int[] nums){
        int n = nums.length;

        int[] preffixSum = new int[n];
        int[] suffixSum = new int [n];
        
        preffixSum[0] = 1;
        for(int i =1 ;i<n ;i++){
           preffixSum[i] = preffixSum[i-1] * nums[i-1];
        }
        suffixSum[n-1]  = 1;
        for(int i = n-2 ; i > 0 ; i--){
            suffixSum[i] = suffixSum[i+1] * nums[i+1];
        }
        int[] res = new int[n];
        for(int i =0 ;i<n;i++){
        res[i] = preffixSum[i] * suffixSum[i];
        }
        return res;
    }

    public static void main(String[] args) {
        productofArray solution = new productofArray();
        
        // Example input array
        int[] nums = {1, 2, 3, 4};
        
        // Call the productExceptSelf method
        int[] result = solution.productOfArrayExceptSelf(nums);
        
        // Print the result
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Output array: " + Arrays.toString(result));
    }
}

