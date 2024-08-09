public class singleelement {
    public static int singleElement(int[] num){
        int result = 0;
        for(int i = 0;i<num.length;i++){
            result = result ^ num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] n = {2,2,1,1,4};
        System.out.println(singleElement(n));
    }
    
}
