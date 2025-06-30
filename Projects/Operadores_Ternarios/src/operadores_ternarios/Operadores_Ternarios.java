
package operadores_ternarios;

import java.util.Scanner;


public class Operadores_Ternarios {


    public static void main(String[] args) {
        
        /* Programa que, dependiendo el promedio de
        un alumno, nos diga si aprobó o no una materia
        */
        
        //declaración de variables
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        //pedirle al usuario que ingrese el promedio por teclado
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        
        /*
        if (promedio>=6){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Desaprobado");
        }
        */
        
        // con operador ternario más rápido
        condicionFinal = (promedio>=6) ? "Aprobado":"Desaprobado";
        
        //impresión de resultados
        System.out.println("La condición final del alumno es: " + condicionFinal + ". El promedio fue: " + promedio);
    }
    
}
