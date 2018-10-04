import java.util.*;

class StringArray{
   
    int index;
    
    int size;
    
    char charry[];
    
    StringArray(int size){
    
        this.size=size;
        
        index=-1;
        
        charry=new char[size];
    }
    
    void add(char c){
        
        if(index==size-1){
        
            char temp[]=charry;
            
            size=size*2;
            
            charry=new char[size];
            
            for(int i=0; i<temp.length; i++){
                
                charry[i]=temp[i];
            }
            
            charry[++index] = c;
        }
        
        else
            charry[++index] = c;
        
    }
    
    void sortArray(){
        
        
        for(int i=0; i<size; i++){
            
            for(int j=0; j<size; j++){
                
                char t1=charry[i];
                
                char t2=charry[j];
                
                if(Character.isUpperCase(t1))
                    t1=Character.toLowerCase(t1);
                
                if(Character.isUpperCase(t2))
                    t2=Character.toLowerCase(t2);
                
                //System.out.println(t1+" "+t2);
                if(t1<t2){
                    
                    char c=charry[i];
                    
                    charry[i]=charry[j];
                    
                    charry[j]=c;
                }
            }
        }
        
        for(int i=0; i<size; i++){
            
            if(Character.isUpperCase(charry[i]))
            
                System.out.print(Character.toLowerCase(charry[i])+" ");
           
            else
                
                System.out.print(Character.toUpperCase(charry[i])+" ");
        }
        
        System.out.println();
        
    }
}

public class bubblesort {
 
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        StringArray a =  new StringArray(n);
         
        for(int i=0; i<n; i++){
            
            char c = sc.next().charAt(0);
            
            a.add(c);
        }
        
        a.sortArray();
       
    }
}