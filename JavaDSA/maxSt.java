import java.util.HashMap;

public class maxSt {
    public int maxLenOfSubString(String s){
        int n = s.length();
        int left = 0,right =  0;
        HashMap<Character,Integer> map = new HashMap<>();
        int len  = 0;
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) +1,left);
                map.put(s.charAt(right),right);
                len = Math.max(len,right-left+1);
                right++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
       maxisubstringcharlen m = new maxisubstringcharlen();
        String s = "Sumannddhaar";
        int res = m.maxLenOfSubString(s);
        System.out.println(res);
        
    }
}
