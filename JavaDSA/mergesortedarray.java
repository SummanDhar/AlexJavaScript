class mergesortedarray{
    public  void merge(int[] arr1 , int m , int[] arr2,int n){
        int len1 = arr1.length;
        int end_idx = len1-1;
        while(m>0 && n>0){
            if(arr2[n-1] >= arr1[m-1]){
                arr1[end_idx] = arr2[n-1];
                n--;
            }else{
                arr1[end_idx] = arr1[m-1];
                m--;
            }
            end_idx--;
        }
        while(n>0){
            arr1[end_idx] = arr2[n-1];
            n--;
            end_idx--;
        }

    }
    public static void main(String[] args) {
        mergesortedarray merger = new mergesortedarray();
        
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        
        System.out.println("Before merging:");
        System.out.print("arr1: ");
        printArray(arr1);
        System.out.print("arr2: ");
        printArray(arr2);
        
        merger.merge(arr1, m, arr2, n);
        
        System.out.println("\nAfter merging:");
        System.out.print("arr1: ");
        printArray(arr1);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


