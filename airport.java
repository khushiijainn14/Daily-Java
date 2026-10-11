//Airport Security – Sort Risk Levels
//Airport security officials have confiscated several items from passengers at a security checkpoint. All items have been placed in a box (array). Each item is assigned a risk level of 0, 1, or 2.
//The risk severity of the items is represented by an array of N integers. Your task is to sort the array in ascending order based on the risk levels.
//The risk values range from 0 to 2.
//Input:
//- The first line contains an integer N, representing the number of items.
//- The next N integers represent the risk levels of the items, with each value provided on a separate line.
//Output:
//Print the array elements sorted in ascending order, separated by spaces.

//this is like dutch national flag algo and we will be using the 3 pointers approch in this 

import java.util.*;
public class airport {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }else if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;        
            }else{
                mid++;
            }
        }   
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }
}