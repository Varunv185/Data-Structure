import java.util.Scanner;

public class rigtShift {
    
    static void rev(int nums[],int st,int ed){
        while(st<ed){
            int t=nums[st];
            nums[st]=nums[ed];
            nums[ed]=t;
            st++;
            ed--;
        }
    }
    static void rotateElemet(int nums[],int k){
        int n=nums.length;
        k%=n;
        rev(nums,0,n-1);
        rev(nums, 0, k-1);
        rev(nums, k, n-1);
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        int a[]=new int [n];
        //input
        for(int i=0;i<=n-1;i++){
            System.out.print("Enter the element :");
            a[i]=sc.nextInt();
        }
        //output
        for(int e:a){
            System.out.print(e+"\t");
        }

        //logic
        // int t=a[n-1];
        // for(int i=n-1;i>0;i--){
        //     a[i]=a[i-1];
        // }
        // a[0]=t;
        rotateElemet(a, 1);

        System.out.println();
        //output
        for(int e:a){
            System.out.print(e+"\t");
        }
    }
    
}
