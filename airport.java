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
