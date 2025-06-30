
package ejemplo_bucleinfinito;

import java.util.Scanner;

public class Ejemplo_bucleInfinito {


    public static void main(String[] args) {
        
        /* EJEMPLO 1 Bucle infinito
        int contador = 0;
        
        while (contador<10){
        
            System.out.println("Bucle infinito");
        */
        
        // EJEMPLO 2 Bucle infinito
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while (bandera == true){
        
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("¿Sos de Millonarios FC? " + bandera);
            
            System.out.println("¿Querés pasarte a Atlético Nacional?");
            respuesta = teclado.next();
            System.out.println("-------------------------------------------");
            
            /*if (respuesta.equalsIgnoreCase("Si")) {
                bandera = false;
            }*/
            
            
        }
    }
        
    }
        
    
