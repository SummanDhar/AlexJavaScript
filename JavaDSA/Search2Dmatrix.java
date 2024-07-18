//import java.util.*;
public class Search2Dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (target == mid_val)
                return true;
            else if (target < mid_val)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }



    public static void main(String[] args) {
        Search2Dmatrix solution = new Search2Dmatrix();

        // Define the matrix and the target value
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 13;

        // Call the searchMatrix method and print the result
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println(result ? "true" : "false");

        // // Another example
        // target = 10;
        // result = solution.searchMatrix(matrix, target);
        // System.out.println("Target " + target + " found: " + result);
    }
    
}

