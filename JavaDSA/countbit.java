public class countbit {
    public static int  CountBitt(int num){
        int cnt = 0;
        while(num != 0){
            cnt += num & 1;
            num >>>= 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountBitt(n));
    }
}
