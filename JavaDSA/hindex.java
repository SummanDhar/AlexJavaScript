public class hindex {
    public static int HIndexx(int[] citation){
        int n = citation.length;
        for(int i = 0 ; i<n; i++){
            int h = n-i;
            if(citation[i] >= h){
                return h;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,6,4};
        System.out.print(HIndexx(nums));
        System.out.println();
    }
    
}
