import java.util.*;

public class WaveArray {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[][]=new int[n][n];
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                if(i==n-1 && j==n-1){
                    System.out.println(arr[i][j]);
                }
                else
                    System.out.print(arr[i][j]+",");
            }
        }
        
        sc.close();
    } 
}