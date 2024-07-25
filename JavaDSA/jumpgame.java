public class jumpgame {
    // public static boolean JumpGamee(int[] nums){
    //     int  reachable = 0;
    //     for(int i = 0 ;i<nums.length ;i++){
    //        if(i > reachable) return false;
    //        reachable = Math.max(reachable,i+nums[i]);
    //     }
    //     return true;
    // }
    // methos2

public static int JumpGamee(int[] nums){
      int n = nums.length;
      int reachable = 0;
      int end = 0;
      int steps = 0;
      for(int i =0 ;i<n;i++){
        reachable = Math.max(reachable,i+nums[i]);
        if(i == end){
            steps++;
            end = reachable;
        }
        if(end >= n-1){
            break;
        }
      }
      return steps;

}

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        int res = JumpGamee(arr);
        System.out.println(res);
}
}