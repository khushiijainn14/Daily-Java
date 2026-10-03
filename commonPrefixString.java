//Write a function to find the longest common prefix string among an array of strings. If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower", "flow", "flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog", "racecar", "car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

import java.util.*;
public class commonPrefixString {
    static  String commonPrefixString(String[] str){
        if(str==null || str.length==0){
            return "";
        }

        String first=str[0];
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);

            for(int j=1;j<str.length;j++){
                if(i>=str[j].length() || str[j].charAt(i)!=ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String str[]=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }

        String result;
        result=commonPrefixString(str);

        System.out.print(result);
        sc.close();
    }   
}
