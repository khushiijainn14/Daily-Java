//Basically we will be having a string ***### ###*** *#*#*### any of these kind of formate and we have to count the diff thats it 
// It is valid if both are same 

import java.util.*;

public class countSpecialChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int starCount=0;
        int hashCount=0;

        for(char ch: s.toCharArray()){
            if(ch=='*')
                starCount++;
            else if(ch=='#')
                hashCount++;
        }

        int x=starCount-hashCount;
        System.out.println(Math.abs(x));
        sc.close();
    }
}