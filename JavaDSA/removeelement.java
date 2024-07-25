public class removeelement {
    public static int removeElementFromArray(int[] nums , int val){
        int lengthh = 0;

        for(int i =0 ; i<nums.length;i++){
            if(nums[i] != val){
                nums[lengthh] = nums[i];
                lengthh++;
            }
        }
        return lengthh;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElementFromArray(nums, val));
    }
}
