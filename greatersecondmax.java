import java.util.*;
public class greatersecondmax {

    static int secondMax(int a[]){
        int max=0,smax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            if(a[i]>smax && a[i]<max){
                smax=a[i];
            }
        }
        return smax;
    }
    static void input(int a[]){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of : ");
        int n=sc.nextInt();

        int a[]=new int [n];
        input(a);

        System.out.println(secondMax(a));
    }
    
}
