import java.util.*;
public class Twosumv2 {
    public int[] twoSumv2(int n , int[]arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
       int[] ans = new int[2];
       ans[0]=ans[1] = -1;
        for(int i =0;i<n;i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);

        }
        return ans;

    }
    public static void main(String[] args){
        Twosumv2 t = new Twosumv2();
        int n =5;
        int[] arr = {2,5,4,3,1};
        int target = 9;
        int[] ans = t.twoSumv2(n,arr,target);
        System.out.println(ans[0] +" , " + ans[1] + " "); 
    } 
}
