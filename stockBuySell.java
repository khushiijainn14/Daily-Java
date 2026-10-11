//Rahul observes the stock price every day. He wants to make the maximum possible profit by buying and selling the stock.
//Conditions:
//1. He can buy the stock only once.
//2. After buying, he must sell it on a later day.
//3. He cannot sell before buying.
//Given the stock prices for N days, find the maximum profit possible.
// so like we have an array [7,1,4,5,9]
//we have to calculate the maxprofit 
//we are using greedy algo which says --- maximize at each step 
//tc- o(n)

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

       int buyPrice=arr[0];
       int profit=0;

       for (int i= 0; i < arr.length; i++) {
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }else{
                int diff=arr[i] -buyPrice;
                profit=Math.max(diff,profit);
            }
          
           
       }

        System.out.println("answer is "+ profit);
        sc.close();
    }
    // we can like also do in one pass
}
