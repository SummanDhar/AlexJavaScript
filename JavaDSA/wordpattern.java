import java.util.*;
public class wordpattern {
    public static boolean WordPatternn(String pattern , String str){
        String[] word = str.split(" ");
        if(word.length != pattern.length()) return false;
        Map<Object,Integer> text = new HashMap<>();
        for(int i = 0 ; i<word.length;++i){
         if(text.put(pattern.charAt(i),i) != text.put(word[i],i)){
            return false;
         }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        //Solution solution = new Solution();
        boolean result = WordPatternn(pattern, str);

        System.out.println("Does the string follow the pattern? " + result);
        
        scanner.close();
    }
}
