import java.util.Scanner;

public class funcheckSorted {
   static boolean sort(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
            
        }
        return true;
   }
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size:");
    int n=sc.nextInt();

    int a[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter the element :");
        a[i]=sc.nextInt();
    }
    System.out.println(sort(a));
   }
    
}
