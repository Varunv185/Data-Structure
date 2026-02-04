public class fibboRecursion {
    static int cnt =0;
    static int fibbo(int n){
        cnt++;
        if((n==0)||(n==1)){
            return n;
        }
        return fibbo(n-2)+fibbo(n-1);
    }
    public static void main(String[]args){
        System.out.println(fibbo(8));
        System.out.println(cnt);
        
    }
}
