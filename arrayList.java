import java.util.*;

public class arrayList{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(x);
        }

        System.out.print(arr);

        sc.close();
    }
}
