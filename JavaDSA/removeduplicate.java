public class removeduplicate {
    public int RemoveDuplicatee(int[] a){
        int n = a.length;
        int i =0;
        for(int j = 1; j<n ;j++){
         if(a[i] != a[j]){
            a[i+1] = a[j];
            i++;
         }
        }
        return i+1;
    }
    public static void main(String[] args) {
        removeduplicate r = new removeduplicate();
        int[] a = {1,1,2,2,2,3,3};
        int k = r.RemoveDuplicatee(a);
        System.out.println("The array after removing duolicate element:");
        for(int i =0 ;i<k;i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
