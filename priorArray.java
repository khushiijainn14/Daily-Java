//Given an integer array Arr of size N, the task is to find the count of elements whose value is greater than all of its prior elements.
//Note: 1st element of the array should be considered in the count of the result.
//For example, Arr[] = {7, 4, 8, 2, 9}. As 7 is the first element, it will be considered in the result. 8 and 9 are also the elements that are greater than all of its previous elements. Since a total of 3 elements is present in the array that meets the condition.
//Hence the output = 3.
//Example 1:
//Input 5 → Value of N, represents size of Arr
//7 → Value of Arr[0]
//4 → Value of Arr[1]
//8 → Value of Arr[2]
//2 → Value of Arr[3]
//9 → Value of Arr[4]

import java.util.*;
public class priorArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=1;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int priorEle=arr[0];

        for(int i=1;i<n;i++){
            if(priorEle<arr[i]){
                count++;
                priorEle=arr[i];
            }
           
        }
        System.out.println("Answer"+ count);
        sc.close();
    }
    
}
