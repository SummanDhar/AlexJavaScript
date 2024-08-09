class bitOr {
    public int minFlips(int a, int b, int c) {
        int fliper = 0;
        while(a >0 || b>0 || c>0){
        int Abit = a & 1;
        int Bbit = b & 1;
        int Cbit = c & 1;
        if(Cbit == 0){
            fliper += (Abit + Bbit);
        }else{
            if(Abit==0 && Bbit==0){
                fliper += 1;
            }
        }
          a >>= 1;
          b >>= 1;
          c >>= 1;
    }
       return fliper;
    }
    public static void main(String[] args) {
        bitOr bb = new bitOr();
        int a = 2;
        int b = 6;
        int c = 5;
        int res = bb.minFlips(a, b, c);
        System.out.println(res);

    }
}
