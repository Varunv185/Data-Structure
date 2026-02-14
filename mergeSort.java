import java.util.Scanner;

class mergeSort{
    static void merge(int []a,int []b,int []c){
        int n1=a.length,n2=b.length,i,j,k;

        //1st we are comparing the array and coping it into the the 3 new array
        for(i=0 ,j=0 ,k=0 ; i<n1 && j<n2 ; k++){
            if(a[i]<b[j]){
                c[k]=a[i++];
            }
            else{
                c[k]=b[j++];
            }
        }
        //comparing the remaning of 1st array
        while(i<n1){
            c[k++]=a[i++];
        }

        //comparing the remaining of 2nd array
        while(j<n2){
            c[k++]=b[j++];
        }
    }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the size of 1st arrary :");
    int n1=sc.nextInt();
    int []a1=new int[n1];
    for(int i=0;i<n1;i++){
        System.out.print("Enter element :");
        a1[i]=sc.nextInt();
    }

    System.out.print("Enter the size of 2st arrary :");
    int n2=sc.nextInt();
    int []a2=new int[n2];
    for(int i=0;i<n2;i++){
        System.out.print("Enter element :");
        
        a2[i]=sc.nextInt();
    }

    int []a3=new int[n1+n2];

    merge(a1,a2,a3);

    for(int e:a3){
        System.out.print(e+"\t");
    }
  }  
}
