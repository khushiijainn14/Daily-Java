//we will be having a bracket input which is seperated by the comma like [1,2,3,4] like this and the bracket can be of any type 
// we have to convert this into a arraylist first 

import java.util.*;

public class bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        if(input.startsWith("[") && input.endsWith("]")){
            input=input.substring(1, input.length()-1);
        }

        String ch[]=input.split(",");

        ArrayList<Integer> list=new ArrayList<>();

        for(String token: ch){
            int x=Integer.parseInt(token);
            list.add(x);
        }
        System.out.print(list);
        sc.close();
    }
    
}
