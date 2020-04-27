
package multiplicacionrusa;

import java.util.Scanner;

public class MultiplicacionRusa {

    public static void main(String[] args) {
          int a,b;
        int acu=0;
        Scanner teclado = new Scanner (System.in); 
        System.out.println("Ingrese el primer numero");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = teclado.nextInt();
        
        //Calc operacion = new Calc();
        //operacion.condic(a,b);
             }
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
        System.out.println("Resultado: "+acu); 
}
}    
}
