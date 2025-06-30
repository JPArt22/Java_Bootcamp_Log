
package ejemplo_while;

import java.util.Scanner;


public class Ejemplo_While {

    
    public static void main(String[] args) {
        
        //int contador = 0;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        /*while (contador<10){
        
            System.out.println("Estoy en la vuelta número: " + contador);
            contador++;
        
        }*/
        
        while (bandera == true){
        
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("¿Sos de Millonarios FC? " + bandera);
            
            System.out.println("¿Querés pasarte a Atlético Nacional?");
            respuesta = teclado.next();
            System.out.println("-------------------------------------------");
            
            if (respuesta.equalsIgnoreCase("Si")) {
                bandera = false;
            }
            
            
        }
        
    
    }
}
