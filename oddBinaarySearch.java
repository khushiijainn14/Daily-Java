//Most probably when we see TC- log(n) we will be using binary search 
//

import java.util.*;
public class oddBinaarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //apply binary search 
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }

            if(arr[mid]==arr[mid+1]){
                low=mid+2;
            }else{
                high=mid;
            }

        }
        System.out.println("Odd element is "+ arr[low]);
    }
}
