
package matriz_exercise;

import java.util.Scanner;


public class Matriz_Exercise {


    public static void main(String[] args) {
        
        // matriz de 4 filas y 3 columnas, cada fila corresponde a las notas de cada alumno
        
        double notas[][] = new double[4][3];
        double prom, sum = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("****** Students Qualifications Program ******");
        System.out.println("---------------------------------------------");
        // for para recorrer la matriz y pedir las notas de cada alumno
        for (int r = 0; r < notas.length; r++){ //recorrer cada fila
            
            for (int c = 0; c < notas[1].length; c++){  // recorrer cada columna dentro de cada fila
                
                System.out.println("Ingrese la nota "+ (c+1) + " para el alumno "+ (r+1) + ": ");
                notas[r][c] = teclado.nextDouble();
                
            }
            System.out.println("---------------------------------------------");
        }
        
        for (int r = 0; r < notas.length; r++){
            
            // actualizamos variables sum y prom para que no se crucen las notas entre estudiantes
            sum = 0; 
            prom = 0;
            
            System.out.println("Las notas del alumno "+ (r+1) + " son: "); // solo se imprime acá para que no se repita siempre
            for (int c = 0; c < notas[1].length; c++){  // aquí recorremos las notas
                
                System.out.println(notas[r][c]);    //mostramos las 3 notas del alumno r
                sum = sum + notas[r][c];            // sumamos todas las notas del alumno r
                prom = sum / notas[1].length;       // dividimos la suma de todas las notas entre la cantidad de notas
                
            }
            
            System.out.println("La nota final es: " + prom); 
            System.out.println("---------------------------------------------");
            
        }
    }
    
}
