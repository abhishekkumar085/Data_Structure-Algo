public class PpowerQrecursive {
    public static int f(int p,int q){
        if(q==0){
            return 1;
        }
        return p*f(p, q-1);
    }
    public static void main(String[] args) {
        int result=f(2, 3);
        System.out.println(result);
    }
}
