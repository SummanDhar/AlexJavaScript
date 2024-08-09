public class validpalindrom {
    public static boolean isPalindrom(String s){
        if(s.isEmpty()){
            return true;
        }
        int fast = 0;
        int last = s.length()-1;

        while(fast<=last){
            char currFast = s.charAt(fast);
            char currLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currFast)){
                   fast++;
            }else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }else{
                if(Character.toLowerCase(currFast) != Character.toLowerCase(currLast)){
                    return false;
                }
                fast++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrom(s));
    }
}
