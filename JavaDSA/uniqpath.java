public class uniqpath {
    public int uniqPaths(int m , int n){
    int N = m+n-2;
    int r = m-1;
    double res = 1;
    for(int i = 1 ; i<=r ;i++){
        res = res*(N-r+i)/i;
    }

    return (int)res;
}
public static void main(String[] args){
    uniqpath p = new uniqpath();
    int m = 3;
    int n = 7;
    int result = p.uniqPaths(m,n);
    System.out.println("Number of uniq path is:" + result);
}
}