import java.util.*;
public class threesum {
    public List<List<Integer>> ThreeSumm(int[] num){
        int n = num.length;
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(i > 0 && num[i] == num[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                long sum = num[i];
                sum+= num[j];
                sum += num[k];

                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(num[i]);
                    temp.add(num[j]);
                    temp.add(num[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(j<k && num[j] == num[j-1])j++;
                    while(j<k && num[k] == num[k+1])k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }

        }
        return res;
    }
    public static void main(String[] args) {
        threesum solution = new threesum();
        
        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.ThreeSumm(nums1);
        System.out.println("Test case 1 result: " + result1);
    }
}