
package ejercicio_vector02;

import java.util.Scanner;


public class Ejercicio_Vector02 {


    public static void main(String[] args) {
        
        int numeros[] = new int[9];
        int max = 0;
        int min = 0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++){
           
            System.out.println("Ingrese el número para i:" + (i+1));
            numeros[i] = teclado.nextInt();
        }
        
        // número más grande
        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] > max){
                
                max = numeros[i];
                min = max;
            }
            
        }
        
        //número más pequeño
         for (int i = 0; i < numeros.length; i++){
            
            if (numeros[i] < min){
                
                min = numeros[i];
            }
            
        }
         
        System.out.println("\n" + "--------------------------------------------------------");
        System.out.println("El número más grande es: "+ max);
        System.out.println("El número más pequeño es: "+ min);
        
        
    }
    
}
