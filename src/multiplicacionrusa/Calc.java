
package multiplicacionrusa;


public class Calc {
    int a,b,c,d;
    int acu=0;
    public void condic(int a, int b){
        
        if(b%2==0){
            acu=0;
        }
        else{
            acu=a;
            
        }
        while(b>=1){
           c=a*2;
           d=b/2;
           a=c;
           b=d;
           
            if(b%2==0){
            
            
        }
        else{
            acu=acu+a;
                     
        }
        
    }
        
}
}