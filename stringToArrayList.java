import java.util.*;

public class stringToArrayList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();
        String ch[]=st.split(",");

        ArrayList<Integer> arr=new ArrayList<>();

        for(String token: ch){
            int n=Integer.parseInt(token);
            arr.add(n);
        }

        System.out.print(arr);
        sc.close();
    }
    
}