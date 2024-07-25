import java.util.*;
public class MajorityElement {
    public List<Integer> MejorityElement(int[] nums){
        List<Integer> result = new ArrayList<>();
        if(nums == null ||  nums.length == 0)return result;

        int candidate1 = 0, candidate2 = 0, count1=0, count2=0;

        for(int num : nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }
        }
       
        int n = nums.length;
        if(count1 > n/2){
            result.add(candidate1);
        }
        if(count2 > n/2){
            result.add(candidate2);
        }
        return result;
    }
    public static void main(String[] args) {
        MajorityEle solution = new MajorityEle();
        int[] nums = {2,2,1,1,1,2,2,2,6,6,7,6,6,6};
        System.out.println(solution.majorityElement(nums)); // Output: [3]
    }

}
