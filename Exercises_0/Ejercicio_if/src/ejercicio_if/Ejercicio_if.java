package ejercicio_if;

import java.util.Scanner;


public class Ejercicio_if {

    
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        
        if(edad > 18){
            System.out.println("Felicidades, usted es mayor de edad");
 
            if(edad>40){
                System.out.println("Sos generación X");
            }
            else{
                System.out.println("Sos milenial o centenial");
            }
        }
        
        else{
            
            if (edad == 18){
                System.out.println("Tienes exactamente 18 años");
            }
            else {
            System.out.println("No puedes acceder, sos menor");
            }
        }
    }
    
}
