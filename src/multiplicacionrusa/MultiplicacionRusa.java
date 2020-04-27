
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
    
      Calc operacion = new Calc();
        operacion.condic(a,b);
}
    
}
