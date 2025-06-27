
package operadores;

import java.util.Scanner;


public class Operadores {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();
        
        sum = num1 + num2;
        System.out.println("El resultado23 es: " + sum);
        
        
    }
    
}
