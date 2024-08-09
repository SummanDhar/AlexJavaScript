import java.util.*;
public class ransom {
    public static boolean ransomNode(String magzine , String ransomnode){
        if(ransomnode.length() > magzine.length()) return false;
        int[] currchar = new int[26];
        for(char c : magzine.toCharArray()){
            currchar[c - 'a']++;
        }
        for(char c : ransomnode.toCharArray()){
            if(currchar[c - 'a'] == 0) return false;
            currchar[c - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words of ransom: ");
        String ransom = sc.next();
        System.out.println("enter word of magzin: ");
        String magzin = sc.next();
        boolean output = ransomNode(magzin, ransom);
        System.out.println(output);
        sc.close();

    }
}
