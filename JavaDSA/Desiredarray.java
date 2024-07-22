import java.util.*;
class Desiredarray{
   public int DesiredArrayy(int[] arr,int n ,int k){
    List<Integer> nonDivisibleNumber = new ArrayList<>();

    int num = 1;
    while(nonDivisibleNumber.size() < k){
        boolean isDivisible = false;

        for(int value : arr){
            if(num % value == 0){
                isDivisible = true;
                break;
            }
        }
        if(!isDivisible){
            nonDivisibleNumber.add(num);
        }
        num++;
    }
    int sum = 0;
    for(int number : nonDivisibleNumber){
       sum += number;
    }
    return sum;
   }
    public static void main(String[] args) {
        Desiredarray d = new Desiredarray();
        int n = 4;
        int k = 4;
        int[] arr = {3,6,9,12};
        
       
        System.out.println(d.DesiredArrayy(arr, n, k));
    }
}