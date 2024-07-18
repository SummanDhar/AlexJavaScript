class reversestring {
    public String reverseWords(String s) {
        String[] word = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        reversestring r = new reversestring();
        String st = "the sky is blue";
        String res = r.reverseWords(st);
        System.out.println(res);
    }
}
