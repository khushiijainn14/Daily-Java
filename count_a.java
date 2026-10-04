//A furnishing company manufactures curtains in two colors: aqua ('a') and black ('b'). The colors are represented by a string str of length N, consisting only of 'a' and 'b'.
//The curtains are packed into boxes containing L curtains each. Each box corresponds to a substring of length L. If any curtains remain after filling the boxes, they form one additional box, even if it contains fewer than L curtains.
//The box containing the maximum number of aqua-colored curtains ('a') is labeled. Find and print the number of aqua-colored curtains in that box.
//Input
//- The first line contains the string str.
//- The second line contains an integer L, the maximum number of curtains per box.
//Output
//Print the maximum number of 'a' characters in any box.

//INPUT
//bbbaaababa
//3
//Output
//3

import java.util.*;
public class count_a {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        String str=sc.next();

        int max=0;
        for(int i=0;i<str.length();i+=L){
            int count=0;
            for(int j=i;j<Math.min(i+L,str.length());j++){
                if(str.charAt(i)=='a'){
                    count++;
                }
            }

            if(max<count){
                max=count;
            }
        }
        System.out.println(max);
        sc.close();
    }
    
}
