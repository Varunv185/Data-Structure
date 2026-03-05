import java.util.Scanner;

public class buyAndSellStock {
    static int profitMax(int [] prices){
        int profit=0;
        int buy_price=prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy_price>prices[i]){
                buy_price=prices[i];
            }
            else{
                int current_profit = prices[i] - buy_price;
                profit =Math.max(current_profit, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size :");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element :");
            arr[i]=sc.nextInt();
        }
    System.out.println(profitMax(arr));

    }
    
}