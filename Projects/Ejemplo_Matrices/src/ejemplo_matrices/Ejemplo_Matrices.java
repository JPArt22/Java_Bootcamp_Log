
package ejemplo_matrices;

import java.util.Scanner;


public class Ejemplo_Matrices {


    public static void main(String[] args) {
        
        int matriz [][] = new int [3][4];   // matriz cuadrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Número de filas: " + matriz.length);
        System.out.println("Número de filas: " + matriz[0].length);
        
        // para recorrer la matriz usamos 2 for, uno para las filas y otro para las columnas
        for(int row = 0; row < matriz.length; row++){
            for(int column = 0; column < matriz[0].length; column++ ){         // matriz.length solo sirve para las columnas
                
                System.out.println("Ingrese el valor para la fila: " + row + " y para la columna: " + column);
                matriz[row][column] = teclado.nextInt();
            }
        }
        
        for(int row = 0; row < matriz.length; row++){
            for(int column = 0; column < matriz[0].length; column++ ){
                
                System.out.println("Row: " + row + " & Column: " + column + " | Result: " + matriz[row][column]);
                
            }
        }
        
        
        /* 
        ¿Cómo hacer para matrices no cuadradas? 
        ==> Basta con hacerle length a una fila de la matriz para obtener número de columnas
        así: matriz[0].length
        */
        
        
    }
    
}
