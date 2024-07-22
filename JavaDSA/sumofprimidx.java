public class sumofprimidx {
    public static boolean isPrime(int num){
          if(num <= 1){
            return false;
          }
          for(int i = 2; i*i<=num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimeindex(int[] arr , int n){
          if(arr == null || n == 0) return -1;
          int sum = 0;
        for(int i = 0 ; i<n ;i++){
           if(isPrime(i))
            sum += arr[i];
            } 
        
        return sum;

    } 
    public static void main(String[] args) {
        int[] arr = {1,2,-3,55,51,34,5,-4,66,8,63,45};
        int  n = arr.length;
        System.out.println(sumOfPrimeindex(arr, n));
    }
}
