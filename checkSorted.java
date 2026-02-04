import java.util.Scanner;

public class checkSorted{
    static boolean isSort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        // input
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements :");
            a[i]=sc.nextInt();
        }
        System.out.println(isSort(a));
        
        

    }
}