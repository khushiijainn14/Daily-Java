//how to take input of array without knowing its size 
// 1 2 3 4 
// 1,2,3,4
// [1,2,3,4]
//These are some possible cases for this 

import java.util.*;

public class inputArrayW{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        String ch[]=input.split(" ");

        int arr[]=new int[ch.length];

        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }

        
    }
    
}
