import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class removeDupliacte {
    static int[] remove(int a[]){// brute force approch
        Set<Integer> s =new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }

         int index =0;
         for(int it :s){
            a[index]=it;
            index++;
         }
         if(index!=a.length){
            for(int i=index;i<a.length;i++){
                a[i]=0;
            }
         }
         return a;
    }

    static int removeDuplicate(int a[]){  //optiaml appraoch return only count 
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
            }
        }
        return i+1;
    }
    static int[] removeDupl(int a[]){  //optiaml appraoch return array
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
            }
        }
        while (i!=a.length){
            a[i+1]=0;
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size");
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element:");
            a[i]=sc.nextInt();
        }
        int b[]=remove(a);
        for(int e:b){
            System.out.print(e+"\t");
        }
        
        
        //System.out.print(removeDuplicate(a)); 
           }
    
}
