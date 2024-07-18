// //package JavaDSA;
// import java.util.Scanner;

// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         int low = 0, mid = 0, high = n - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 1) {
//                 mid++;
//             } else {
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array:");
//         int n = scanner.nextInt();

//         int[] nums = new int[n];
//         System.out.println("Enter the elements of the array (0, 1, or 2):");
//         for (int i = 0; i < n; i++) {
//             nums[i] = scanner.nextInt();
//         }

//         Solution solution = new Solution();
//         solution.sortColors(nums);

//         System.out.println("The sorted array is:");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         scanner.close();
//     }
// }
