class Solution1 {
    public int[] findMissingAndRepeatedValues(int[][] a) {
        int n = a.length * a[0].length; // size of the array
        
        // Calculate the expected sum of numbers from 1 to n
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate the sum and sum of squares of the array elements
        long S = 0, S2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                S += a[i][j];
                S2 += (long)a[i][j] * (long)a[i][j];
            }
        }

        // S - SN = X - Y
        long val1 = S - SN;

        // S2 - S2N = X^2 - Y^2
        long val2 = S2 - S2N;

        // Find X + Y = (X^2 - Y^2) / (X - Y)
        val2 = val2 / val1;

        // Find X and Y
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)y, (int)x}; // return missing and repeated values respectively
        return ans;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[][] input = {{1, 3}, {2, 2}};
        int[] result = sol.findMissingAndRepeatedValues(input);
        System.out.println("Missing: " + result[0] + ", Repeated: " + result[1]);
    }
}
