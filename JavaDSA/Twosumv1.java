import java.util.*;
public class Twosumv1 {
    public String twoSumv1(int n , int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target ){
                return "YES";
            }
            else if(sum < target){
                left++;
            }else{
                right--;
            }
          
        }
        return "NO";
    }
    public static void main(String[] args){
        Twosumv1 t = new Twosumv1();
        int n =5;
        int[] arr = {2,5,4,3,1};
        int target = 20;
        String result = t.twoSumv1(n,arr,target);
        System.out.println(result); 
    } 
}
