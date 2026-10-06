//We are given two intergers and we have to find the sum between them
// i and j are my two integer 

import java.util.*;
public class sumInRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        int j=sc.nextInt();

        int sum=0;

        if(i>=j || i<0 || j>10000){
            System.out.print("Invalid input");
            return;
        }

        for(int k=i;k<=j;k++){
            sum=sum+k;
        }

        System.out.print("answer is "+sum);
        sc.close();
    }
}
