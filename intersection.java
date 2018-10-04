import java.util.;

class MyArray{
    
    int arr[];

    int index;

    int size;
    
    MyArray(int size){
        
        index=-1;

        this.size = size;

        arr=new int[size];
    }
    
    void add(int data) {
        
        if(index==size-1){
            
            int temp[]=arr;
            
            size=size2;
            
            arr=new int[size];
            
            System.arraycopy(temp, 0, arr, 0, temp.length);
            
            arr[++index]=data;
        }
        
        else
            arr[++index]=data;
        
    }
    
   String findIntersection(MyArray a){
        
        String s=;
       
        int freq1[]=new int[10];
        
        int freq2[]=new int[10];
        
        for(int x arr){
            freq1[x]++;
        }
        for(int x a.arr){
            freq2[x]++;
        }
        
        for(int i=0; i10; i++){
            
            if(freq1[i]0 && freq2[i]0){
                
                int min=freq1[i]  freq2[i]  freq1[i]  freq2[i];
                
                min=2;
                
                while(min0){
                    
                    s+=i+ ;
                    min--;
                }
            }
        }
        return s;
    }
}    
public class intersection {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        MyArray a1=new MyArray(n);
        
        for(int i=0; in; i++){
            
            int x = sc.nextInt();
            
            a1.add(x);
        }
       
        a1.display();
        
        MyArray a2=new MyArray(n);
        
        for(int i=0; in; i++){
            
            int x = sc.nextInt();
            
            a2.add(x);
        }
        
        a2.display();
        
        String s= a1.findIntersection(a2);
        
       
            System.out.print(s);
        
    sc.close();
    
    }
}