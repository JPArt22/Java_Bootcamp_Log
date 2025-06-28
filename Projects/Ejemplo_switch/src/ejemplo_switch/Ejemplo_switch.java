
package ejemplo_switch;

import java.util.Scanner;


public class Ejemplo_switch {

    
    public static void main(String[] args) {
        
        // declaración de variables
        int dia;
        String nombreDia;
        
        //recibir valor
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        dia = teclado.nextInt(); // lee número
        
        switch (dia) {
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miércoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sábado";
                break;
            case 7: nombreDia = "Domingo";
                break;
            
            default: nombreDia = "Día incorrecto";
        }
        
        System.out.println("El nombre del día es: " + nombreDia);
    }
    
    
}
