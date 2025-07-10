
package ejercicio_vectores03;

import java.util.Scanner;


public class Ejercicio_Vectores03 {


    public static void main(String[] args) {
        
        int numeros[] = new int[9];
        int count3 = 0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++){
           
            System.out.println("Ingrese el número para i:" + (i+1));
            numeros[i] = teclado.nextInt();
        }
        
         for (int i = 0; i < numeros.length; i++){
           
            if (numeros[i]==3){
                
                count3++;
            }
        }
        
        System.out.println("La cantidad de veces que se digitó el número 3 es: "+ count3);
    }
    
}
