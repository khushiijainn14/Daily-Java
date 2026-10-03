import java.util.*;
public class diffStringInp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //a full line input 
        String str=sc.nextLine();

        //single character input 
        char ch=sc.next().charAt(0);

        //single word 
        String s=sc.next();

        //Input a word and then convert in into a char array 
        String st=sc.next();
        char arr[]=st.toCharArray();

        //we are having diff diff char 
        int n=sc.nextInt();
        char arrChar[]=new char[n];
        for(int i=1;i<n;i++){
            arrChar[i]=sc.next().charAt(0);
        }

        //string array as a input 
        // khushi inu 
        int m=sc.nextInt();
        String arrS[]=new String[m];
        for(int i=0;i<n;i++){
            //khushi inu
            arrS[i]=sc.next();

            //khushi jain 
            //inu jain 
            //arrS[i]=sc.nextLine();
        }



        //string length str.length()
        //array length arr.length


    }
    
}
