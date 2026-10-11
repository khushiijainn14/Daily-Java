// We have to calculate the sum of n prime numbers.

import java.util.*;

public class sumOfPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        while(n>1){
             boolean prime=true;
          
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    prime=false;
                    break;
                } 

            }
            if(prime){
                sum=sum+n;
            }
            n--;
        }

        System.out.println("SUM IS "+sum);
        sc.close();
    }
}