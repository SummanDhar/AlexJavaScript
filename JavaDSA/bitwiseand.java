public class bitwiseand {
    public static int bitwiseAnd(int left , int right){
        int cnt = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println(bitwiseAnd(left, right));
    }
}
