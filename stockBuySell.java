//Rahul observes the stock price every day. He wants to make the maximum possible profit by buying and selling the stock.
//Conditions:
//1. He can buy the stock only once.
//2. After buying, he must sell it on a later day.
//3. He cannot sell before buying.
//Given the stock prices for N days, find the maximum profit possible.


import java.util.*;
public class stockBuySell {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //n is number of days 
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxDiff=0;
        int profit=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                for(int j=i+1;j<n;j++){
                    int diff= arr[j]-arr[i];
                    maxDiff= Math.max(maxDiff,diff);
                }
            }
            profit=Math.max(profit,maxDiff);
        }
        System.out.println("answer is "+ profit);
        sc.close();
    }
    // we can like also do in one pass
}
