public class fibboRecrsionDyanmic {
    static int dp[]=new int[100];
    static int cnt=0;
    static int fibbo(int n){
        cnt++;
        if((n==1)||(n==0)){
        return n; 
    }
    if(dp[n]==0)
    dp[n]= fibbo(n-1)+fibbo(n-2);
    return dp[n];

}
public static void main(String[]args){
    System.out.println(fibbo(8));
    System.out.println(cnt);
}
    
}
