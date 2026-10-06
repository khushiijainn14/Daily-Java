//A parking lot in a mall has R × C parking spaces. Each parking space is either empty (0) or full (1).
//The status of each parking space is represented as an element of a matrix M[R][C].
//Your task is to find the index of the row that contains the maximum number of parking spaces marked as 1.


import java.util.*;
public class parkingSpace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int mat[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

    
        int currentMax=0;
        for(int i=0;i<n;i++){
            int maxx=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    maxx++;
                }
            }
            currentMax=Math.max(maxx,currentMax);
        }

        System.out.print("Answer is "+ currentMax);
        sc.close();
    }
}