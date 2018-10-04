import java.util.*;
class DynamicArray{
    
    int arr[];

    int index;

    int size;
    
    DynamicArray(int size){
        
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
    
    void reverse(){
        
        for(int i=0,j=arr.length-1; i<j; i++,j--){
            
            int temp=arr[i];
            
            arr[i]=arr[j];
            
            arr[j]=temp;
                      
        }
    }
    
    void display(){
        
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}    
public class ReverseDynamicArray {
 
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        DynamicArray a=new DynamicArray(n);
        
        for(int i=0; i<n; i++){
            
            int x=sc.nextInt();
            
            a.add(x);
        }
        
        for(int i=0; i<n; i++){
            
            int x=sc.nextInt();
            
            a.add(x);
        }
        
        a.reverse();
        
        a.display();
        sc.close();
    } 
}