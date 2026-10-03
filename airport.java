//Airport Security – Sort Risk Levels
//Airport security officials have confiscated several items from passengers at a security checkpoint. All items have been placed in a box (array). Each item is assigned a risk level of 0, 1, or 2.
//The risk severity of the items is represented by an array of N integers. Your task is to sort the array in ascending order based on the risk levels.
//The risk values range from 0 to 2.
//Input:
//- The first line contains an integer N, representing the number of items.
//- The next N integers represent the risk levels of the items, with each value provided on a separate line.
//Output:
//Print the array elements sorted in ascending order, separated by spaces.

import java.util.*;
public class airport {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            switch (arr[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                default:
                    count2++;
                    break;
            }
        }

        for(int i=0;i<count0;i++){
            arr[i]=0;
        }

        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        

        for(int i=count0+count1; i<n; i++){
            arr[i]=2;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }
}
