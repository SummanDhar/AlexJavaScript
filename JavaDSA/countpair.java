import java.util.*;
public class countpair {
    private static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
                right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static int countPairs(int[]arr,int low,int mid,int high){
      int cnt = 0;
      int right = mid+1;
      for(int i = low ;i<=mid;i++){
      while(right <= high && arr[i] > 2*(long)arr[right]){
        right++;
       
      }
      cnt += (right-(mid+1));
    
      }
      return cnt;
    }
    public static int mergeSort(int[]arr,int low,int high){
      int cnt = 0;
      if(low >= high) return cnt;
      int mid = (low+high)/2;
      cnt +=mergeSort(arr,low,mid);
      cnt += mergeSort(arr,mid+1,high);
      cnt += countPairs(arr,low,mid,high);
      merge(arr,low,mid,high);
      return cnt;

    }
    public int reversePair(int[] nums){
     return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args){
        countpair c = new countpair();
        int [] nums = {1,3,2,3,1};
        int result = c.reversePair(nums);
        System.out.println("Number of pairs is:" + result);
    
}
}
