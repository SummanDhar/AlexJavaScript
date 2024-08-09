import java.util.*;
public class twosum {
    public  int[] TwoSum(int[] nums , int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

            while(nums[left] + nums[right] != target){
                if(nums[left]+nums[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
            return new int[] {left+1,right+1};
        }
        public static void main(String[] args) {
            twosum tw = new twosum();
            int[] nums = {2,15,11,7};
            int target = 9;
            int[] res = tw.TwoSum(nums, target);
            //System.out.println(nums);
            System.out.println("[" + res[0] + "," + res[1] + "]");
            
        }
    }

