import java.util.*;
public class smallnumber {
    public static int[] NextSmallerNumber(int[] a , int m){
      if(a == null){
        return null;
      }
      int[] result = new int[m];
      Stack<Integer> stack = new Stack<>();
      for(int i = m-1;i>=0;i--){
        while(!stack.isEmpty() && stack.peek() > a[i]){
            stack.pop();
        }
        
        if(stack.isEmpty()){
            result[i] = -1;
        }
        else{
            result[i] = stack.peek();
        }
        stack.push(a[i]);
      }
      return result;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,11,7,6,5,6,1};
        int m1 = arr.length;
        int[] result = NextSmallerNumber(arr, m1);
        for(int num : result)
        System.out.print(num + " ");
        System.out.println();
    }
    
}
