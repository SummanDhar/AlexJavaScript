public class secondlargestandsmallest {
    public int secondLargest(int[] arr) {
        int n = arr.length;
        if (n <= 3) return 0; // If array length is 3 or less, return 0 as per the problem statement

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate only even indexed elements
        for (int i = 0; i < n; i += 2) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public int secondSmallest(int[] arr) {
        int n = arr.length;
        if (n <= 3) return 0; // If array length is 3 or less, return 0 as per the problem statement

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Iterate only odd indexed elements
        for (int i = 1; i < n; i += 2) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        secondlargestandsmallest sc = new secondlargestandsmallest();
        int[] arr = {3, 2, 1, 7, 5, 4};

        int res1 = sc.secondLargest(arr);
        int res2 = sc.secondSmallest(arr);

        if (res1 == Integer.MIN_VALUE || res2 == Integer.MAX_VALUE) {
            System.out.println(0); // If either value is invalid, return 0
        } else {
            System.out.println(res1 + res2);
        }
        System.out.println(res2);
    }
}