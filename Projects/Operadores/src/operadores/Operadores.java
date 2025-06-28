
package operadores;

import java.util.Scanner;


public class Operadores {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double num1, num2, sum; // para poder almacenar números flotantes (double)
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextDouble(); // para recibir números flotantes (nextDouble)
        
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextDouble();
        
        sum = num1 / num2;
        System.out.println("El resultado23 es: " + sum);
        
        
    }
    
}
