/*  Monkeys and Bananas
There are a total of n monkeys sitting on the branches of a huge tree. As travellers offer bananas and peanuts, the monkeys jump down from the tree.
If every monkey can eat k bananas or j peanuts, and travellers offer m bananas and p peanuts, calculate how many monkeys remain on the tree after some of them jump down to eat.
At a time, one monkey gets down, finishes eating, and goes to the other side of the road. The monkey that has climbed down does not climb up again after eating until the other monkeys finish eating.
A monkey can either eat k bananas or j peanuts. If, for the last monkey, there are fewer than k bananas or fewer than j peanuts left on the ground, only that monkey can eat the remaining bananas (less than k) along with the remaining peanuts (less than j).
Write a program to take inputs n, m, p, k, and j, and return the number of monkeys left on the tree.
Where:
- n = Total number of monkeys.
- k = Number of edible bananas a single monkey can eat. The last monkey may get fewer than k bananas.
- j = Number of edible peanuts a single monkey can eat. The last monkey may get fewer than j peanuts.
- m = Total number of bananas.
- p = Total number of peanuts.
Remember: The monkeys always eat bananas and peanuts, so there is no possibility of k or j having a value of zero.*/

import java.util.Scanner;
public class monkey {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int remMonkey=0;

        int banana_monkey=m/k;
        int rem_banana=m%k;

        int peanut_monkey=p/j;
        int rem_peanut=p%j;

        if(rem_peanut!=0 || rem_banana!=0){
            remMonkey=remMonkey+1;
        }

        remMonkey=n-(banana_monkey+peanut_monkey);
        sc.close();
    }
    
}
