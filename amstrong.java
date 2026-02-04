import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int ori= n;
        int cnt=0;
        while (n>0) {
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
        n=ori;
        int sum=0;
        while(n>0){
            int item =n%10;
            sum+=Math.round(Math.pow(item,cnt));
            n/=10;
        }
        System.out.println(sum);
        if(sum==ori)
        System.out.print("Number is amstrong");
        else
        System.out.print("Number is not amstrong" );
    }
    
}
