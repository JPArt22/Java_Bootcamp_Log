
package ejercicio_vectores4;

import java.util.Scanner;


public class Ejercicio_Vectores4 {


    public static void main(String[] args) {
        
        double sueldos[] = new double[12];
        double sumSueldos = 0, promSueldos;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < sueldos.length; i++){
           
            System.out.println("Ingrese el salario para el mes: " + (i+1));
            sueldos[i] = teclado.nextDouble();
        }
        
        for (int i = 0; i < sueldos.length; i++){
           
            sumSueldos = sumSueldos + sueldos[i];
        }
        
        promSueldos = sumSueldos / sueldos.length;
        
        System.out.println("La suma de todos los sueldos es: " +sumSueldos);
        System.out.println("El promedio de todos los sueldos es: " +promSueldos);
    }
    
    
    
}
