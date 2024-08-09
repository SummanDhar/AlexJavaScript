import java.util.Scanner;

public class plusone {
    public static int[] PluseOnee(int[] arr){
        for(int i = arr.length-1 ;i>=0 ;i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            //if the current element is 9
            arr[i] = 0;
        }
        //if all the element is 9 the create one new array with extra one length and initialize the first element of the array with 1.
        arr = new int[arr.length+1];
        arr[0] = 1;
        return arr;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of element: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the digit one by one: ");
       for(int i = 0; i<n; i++){
       arr[i] = sc.nextInt();
       }
       int[] res = PluseOnee(arr);
       System.out.println("Result after adding one: ");
       for(int digit : res){
         System.out.print(digit + " ");
       }
       sc.close();

    }

}
