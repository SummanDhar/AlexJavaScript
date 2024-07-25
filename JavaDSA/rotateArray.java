public class rotateArray {
    public static void RotateArray(int[] nums , int k){
        k %= nums.length;
        int n = nums.length;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
    public static void reverseArray(int[] nums , int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Before Rotating the array");
        System.out.print("arr: ");
        printArray(nums);
        RotateArray(nums, k);
        System.out.println("\nAfter Rotating the array");
        System.out.print("arr: ");
        printArray(nums);
    }
    public static void printArray(int[] arr ){
        for(int num: arr ){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
