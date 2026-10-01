//Odd Frequency Balloon
//At a fun fair, a street vendor is selling different colours of balloons. He sells N balloons of different colours, represented by an array B[]. The task is to find the colour of the balloon that is present an odd number of times in the bunch of balloons.
//Note:
//- If there is more than one colour that occurs an odd number of times, display the first colour in the array that occurs an odd number of times.
//- The colours of the balloons can be represented using either uppercase or lowercase letters. Uppercase and lowercase letters should be treated as the same colour.
//- If all the colours occur an even number of times, display the message "All are even".

import java.util.*;
public class ballon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //becuase we will be having single characters in this 
        char arr[]=new char[n];
        boolean x=false;

        for(int i=0;i<n;i++){
            //remeber this carefully as we are having sc.next() to ignore the white spaces
            arr[i]=sc.next().toLowerCase().charAt(0);
        }

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        
        for(int i=0;i<n;i++){
            if(map.get(arr[i])%2!=0){
                System.out.println(arr[i]); 
                x=true;
                break;
            }
        }

        if(!x){
        System.out.println("All are even");
        }
        sc.close();

    }
}
    
