public class pattern {
    public static void main(String[] args) {

        //hollow trianlge
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         if(i==n||j==1||j==2*i-1)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        //patter

        int n=4;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
