//Single-Digit Sum of a Number
//An intelligence agency has received reports containing numbers encoded in a mysterious way. Two numbers, N and R, are given.
//The digits of number N are added together, and this operation is repeated R times. The resulting number is then reduced to a single digit by repeatedly adding its digits.
//Your task: Find the single-digit sum of N by repeating the digit-summing operation R times.
//If R = 0, print 0.
//Explanation
//- \(N = 99\), so the sum of its digits is \(9+9=18\).
//- Repeat this sum R = 3 times: \(18+18+18=54\).
//- Reduce 54 to a single digit: \(5+4=9\).

import java.util.*;
public class singleDigitSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();

        if(R==0){
            System.out.print(0);
            sc.close();
            return;
        }

        int sum=0;
        while(N>0){
            int n=N%10;
            sum+=n;
            N=N/10;
        }

        sum=sum*R;
        int result=0;
        while(sum>9){
            while(sum>0){
                int n=sum%10;
                result+=n;
                sum=sum/10;
            }  
            sum=result;
         
        }
        

       System.out.print("Single Digit Sum is "+sum);
        sc.close();
    }
    
}
