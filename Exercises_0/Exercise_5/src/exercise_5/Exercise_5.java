
package exercise_5;

import java.util.Scanner;


public class Exercise_5 {


    public static void main(String[] args) {
        
        String palabra;
        Scanner teclado = new Scanner(System.in);
        
        do{
        System.out.println("Ingrese la palabra");
        palabra = teclado.next();
        
        } while (!palabra.equalsIgnoreCase("Salir"));
    }
    
}
