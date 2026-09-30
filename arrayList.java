//Normal input like we will be giving the number and the we will be storing it in a array list 
import java.util.*;

public class arrayList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arrList =new ArrayList<>();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arrList.add(x);
        }

        System.out.print(arrList);
        sc.close();
    }
}