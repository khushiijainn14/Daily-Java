// we basically will be given a starting day and total number of days we have to calculate the total no of sunday possible 
//





// logic not ccorrect 

import java.util.*;

public class sundayCount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String startDay=sc.next().toLowerCase();
        int n=sc.nextInt();
        int result=0;
        HashMap<String,Integer> map =new HashMap<>();
        map.put("mon",6);
        map.put("tue",5);
        map.put("wed",4);
        map.put("thru",3);
        map.put("fri",2);
        map.put("sat",1);
        map.put("sun",0);

        if(map.containsKey(startDay)){
            int i=0;
            while(n-(map.get(startDay)*i)>0){
                result++;
                i++;
            }
        }

        System.out.print("Number of sundays "+result);

    }
}