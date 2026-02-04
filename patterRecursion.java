public class patterRecursion {
    static void col(int j,int i){
        if(j>i){
            return;
        }
        System.out.print(j);
        col(j+1, i);
    }
    static void row(int i,int n){
        if(i>n){
            return;
        }
        row(i+1, n);
        col(1, i);
        System.out.println();
    }
    public static void main(String[] args) {
        row(1, 5);
    }
    
}
