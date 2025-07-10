
package exercise_array1;

import java.util.Scanner;


public class Exercise_Array1 {


    public static void main(String[] args) {
        
        String nombres[] = new String[8];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < nombres.length; i++){
            
            System.out.println("Ingrese el nombre para i:"+ (i+1));
            nombres[i] = teclado.nextLine();    // line toma una línea de palabras
        }
        
        
        System.out.println("La lista de nombres que ingresó son:");
        for (int i = 0; i < nombres.length; i++){
            
            System.out.println("Nombre para i:"+ (i+1) + "| " + nombres[i]);
        }
    }
    
}
