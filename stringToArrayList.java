//We will be having comma seperated string values and we will be storing it in the arraylist 

import java.util.*;

public class stringToArrayList{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String");
        String input=sc.nextLine();
        String ch[]=input.split(",");
        //String ch[]=input.split(" "); THIS IS FOR SPACE SEPERATED VALUES 

        ArrayList<Integer> arrList=new ArrayList<>();

        for(String token:ch){
            int temp=Integer.parseInt(token);
            arrList.add(temp);
        }

        System.out.println("array list"+ arrList);
        sc.close();
    }
}