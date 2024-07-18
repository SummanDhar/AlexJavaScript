class palindrom {
    public int LCS(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();

        int[] prev = new int[m+1];
        int[] curr = new int[m+1];

        for(int idx1 = 1 ;idx1<=n;idx1++){
            for(int idx2 = 1 ;idx2<=m;idx2++){
                if(s1.charAt(idx1-1) == s2.charAt(idx2-1))
                    curr[idx2] = 1+prev[idx2-1];
                else
                    curr[idx2] = Math.max(prev[idx2],curr[idx2-1]);
            }
            prev = curr.clone();
        }
        return prev[m];
    }
    
    public int longestPalindrome(String s) {
        String sb = new StringBuilder(s).reverse().toString();
        return LCS(s,sb);
    }

    public static void main(String[] args) {
        palindrom solution = new palindrom();
        String s = "abccccdd";
        System.out.println(solution.longestPalindrome(s)); // Output: 7
    }
}
