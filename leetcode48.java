import java.util.Scanner;

public class leetcode48 {
    static void rotateImage(int m[][]){
    int r =m.length;
    int c=m[0].length;
           for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((!(i==j)) && i<j){
                    int t=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=t;
                }
            }
        }

         for(int a=0;a<r;a++){
             int i=0,j=m[0].length-1;
             while(i<j){
                 int t=m[a][i];
                 m[a][i]=m[a][j];
                 m[a][j]=t;
                 i++;
                 j--;
             }
         }
 
}
static void input(int m[][]){
        Scanner sc =new Scanner(System.in);
        int r=m.length;
        int c=m[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Entert the elemnt m["+i+"]["+j+"]");
                m[i][j]=sc.nextInt();
            }
        }
    }

public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row :");
        int r =sc.nextInt();
        
        System.out.println("Enter the colum :");
        int c =sc.nextInt();

        int m[][] =new int[r][c];
        input(m);
        

}  
}
