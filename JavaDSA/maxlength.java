import java.util.HashMap;

public class maxlength {
    public int maxLength(int[] A,int n){
        int maxi = 0;
        int sum = 0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i = 0 ;i<n;i++){
            sum += A[i];
            if(sum == 0){
                maxi = i+1;
            }
            else{
                if(map.get(sum) != null){
                    maxi = Math.max(maxi,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        maxlength m = new maxlength();
        int[] A= {1,-1,3,2,-2,-8,1,7,10,23};
        int n = A.length;
        int result = m.maxLength(A,n);
        System.out.println(result);
    }
    
}
