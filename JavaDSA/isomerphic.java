import java.util.Scanner;

class isomerphic{
    public static boolean Isperphic(String s , String t){
        if(s.length() != t.length()) return false;
        int[] map1 = new int[200];
        int[] map2 = new int[200];

        for(int i = 0; i<s.length();i++){
           if(map1[s.charAt(i)] != map2[ t.charAt(i)]){
            return false;
           }
           map1[s.charAt(i)] = i+1;
           map2[t.charAt(i)] = i+1;
        }
        return true;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s: ");
        String s = sc.next();
        System.out.println("Enter t: ");
        String t =  sc.next();
        boolean output = Isperphic(s, t);
        System.out.println(output);
        sc.close();
    }
}