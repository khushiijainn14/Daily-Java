import java.util.*;
 
public class dutchNationalFlag{
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
                
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid,high);
                high--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}