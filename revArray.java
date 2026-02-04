import java.util.Scanner;

public class revArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" ");
            a[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while (i<j) {
            int t =a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for(int p=0;p<n;p++){
            System.out.print(a[p]+"\t");
        }



    }
    
}
