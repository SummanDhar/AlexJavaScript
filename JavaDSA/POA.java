import java.util.Scanner;

public class POA {
     public static long ProductOfArrayTwo(int[] nums, int n) {
         long product = 1;
         for (int i = 0; i < n; i++) {
             product *= nums[i];
         }
         return product;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of elements: ");
         int N = sc.nextInt();

         if (N <= 0) {
             System.out.println("The array size must be positive.");
             sc.close();
             return;
         }

         int[] arr = new int[N];
         System.out.println("Enter the elements of the array: ");
         for (int i = 0; i < N; i++) {
             arr[i] = sc.nextInt();
         }

         System.out.println("Product of array elements: " + ProductOfArrayTwo(arr, N));
         sc.close();
     }
}
