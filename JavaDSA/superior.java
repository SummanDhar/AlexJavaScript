public class superior {
    public int superiorElement(int[] arr){
        int n = arr.length;
        int maxElement = arr[n-1];
        int count = 1;
        for(int i = n-2 ; i>=0 ;i--){
            if(arr[i] > maxElement){
            count++;
            maxElement = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        superior s = new superior();
        int[]  n = {2,8,9,7,4,2};
        int res = s.superiorElement(n);
        System.out.println(res);
    }
}
