public class maximumnumberofone {
    public int maxiNoOfOne(int [] arr){
        int n = arr.length;
        int count = 0;
        int maxi = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                count++;

            }
            else{
                count = 0;
            }
            maxi = Math.max(maxi,count);
        }
      return maxi;
    }
    public static void main(String[] args) {
        maximumnumberofone m = new maximumnumberofone();
        int [] arr = {1,1,0,1,1,1};
        int k = m.maxiNoOfOne(arr);
        System.out.println("Total numbers of ones is: "+ k);
       
    }
}
