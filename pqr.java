//You are given three integers p, q, and r.
//Your task is to perform operations to make all three numbers equal.
//In one operation, you can:
//- Add 1 to any two of the numbers.
//- Subtract 1 from the third number.
//Find and print the minimum number of operations required to make p, q, and r equal.
//If it is not possible to make all three numbers equal, print -1.

import java.util.*;
public class pqr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int count=0;
        // in three ways we can perform operations 

        if(p==q){
            while(!(p==q && q==r) || q<r) {
                p++;
                q++;
                r--;
                count++;
            }   
        }else if(q==r){
            while((p==q && q==r)  )
            p++;
            r--;
            r++;
            count++;
        }else if(p==r && q==p-1){
            q++;
            r++;
            r--;
            count++;
        }else{
            System.out.print(-1);         
        }

        if(q>r){
            System.out.println(-1);
        }
        System.out.println("Answer is "+count);
        sc.close();
    }
    
}
