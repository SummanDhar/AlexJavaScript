public class diffsumdigit {
    public static int sumOfDigits(int  num){
        int sum = 0;

        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static int DifferenceSumOfDigits(int[] arr , int n){
        int f1 = 0;
        int f2 = 0;
        for(int i =0 ;i<n;i++){
            f1 += sumOfDigits(arr[i]);
        }
        f1 %= 10;

        for(int i =0 ;i<n;i++){
            f2 += arr[i];
        }
        f2 %= 10;

        int f = f1-f2;

        return f;
    }
    public static void main(String[] args) {
        int[] arr = {11,14,16,10,9,8,24,5,4,3};
        int n = 10;

        System.out.println(DifferenceSumOfDigits(arr, n));
    }
}
