import java.util.*;

class ArrayList{
    
    int arr[];

    int index;

    int size;
    
    ArrayList(int size){
        
        index=-1;

        this.size = size;

        arr=new int[size];
    }
    
    void add(int data) {
        
        if(index==size-1){
            
            int temp[]=arr;
            
            size=size*2;
            
            arr=new int[size];
            
            for(int i=0; i<temp.length; i++){
                
                arr[i]=temp[i];
            }
            
            arr[++index]=data;
        }
        
        else
            arr[++index]=data;
        
    }
    
    int findMax(){
        
        int max=arr[0];
        
        for(int x: arr){
            
            max=max < x ? x : max;
        }
        
        return max;
    }
   
}

public class Max_value{

    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList a = new ArrayList(n);
        
        for(int i=0; i<n; i++){
            
            int x=sc.nextInt();
            
            a.add(x);    
        }
        
        for(int i=0; i<n; i++){
            
            int x=sc.nextInt();
            
            a.add(x);    
        }
        
        System.out.println("the max value in the array is: "+a.findMax());
                
        sc.close();
     }
}
