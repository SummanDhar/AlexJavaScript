//import java.util.*;
public class lettertoint {
    public static int getVal(char ch){
    switch (ch) {
        case 'A' : return 1;
        case 'B' : return 10;
        case 'C' : return 100;
        case 'D' : return 1000;
        case 'E': return 10000;
        case 'F' : return 100000;
        case 'G' : return 1000000;
        default : return 0;
    }
    }
    public static int letterTonteger(String str){
        if(str==null) return 0;
        int n = str.length();
        int sum = 0;
       // int modifiedsum = 0;
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(i+1<n && getVal(str.charAt(i+1)) > getVal(ch)){
                sum = sum - getVal(ch);
            }
            else{
                sum = sum + getVal(ch);
                
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String st = "DCCBAA";
        System.out.println(letterTonteger(st));
    }
    
}
