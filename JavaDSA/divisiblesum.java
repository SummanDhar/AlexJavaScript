public class divisiblesum {
    public int isDivisibleOrNotOfSum(int m ,int n){
        int divisiblebyM = 0;
        int notdivisiblebyM = 0;

        for(int i =0;i<=n;i++){
            if(i%m == 0){
                divisiblebyM += i;
            }
            else{
                notdivisiblebyM +=i;
            }
        }
        return notdivisiblebyM - divisiblebyM;
    }
    public static void main(String[] args) {
        divisiblesum sc = new  divisiblesum();
        int m = 6;
        int n= 30;
        int res = sc.isDivisibleOrNotOfSum(m, n);
        System.out.println(res);
    }
    
}
