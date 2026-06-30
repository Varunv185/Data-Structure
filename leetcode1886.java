class leetcode1886 {
    private  static int [][] rotateMatrix(int m[][]){
        int r=m.length;
        int c=m[0].length-1;
        for(int i=0;i<r;i++){  //transpose of the matrix
            for(int j=i+1;j<c;j++){
                int t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }

        for(int a=0;a<r;a++){
            int i=0,j=m.length-1;
            while(i<j){
                int t =m[a][i];
                m[a][i]=m[a][j];
                m[a][j]=t;
                i++;
                j--;
            }
        }
        return m;
    }
    private static boolean isEqual(int a[][],int b[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean findrotate(int mat[][],int target[][]){
        for(int i=0;i<4;i++){
            if(isEqual(mat, target)){
                return true;
            }
            else{
                rotateMatrix(mat);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
