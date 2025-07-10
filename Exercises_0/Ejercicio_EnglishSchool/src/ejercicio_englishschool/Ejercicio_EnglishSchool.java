
package ejercicio_englishschool;

import java.util.Scanner;


public class Ejercicio_EnglishSchool {

    
    public static void main(String[] args) {
        
        //declaración de variables:
        int edad;
        Scanner teclado = new Scanner(System.in);
      
        
        
        //mensaje bienvenida
        System.out.println("***Bienvenidio a English School***");
        System.out.println("ingrese la edad del alumno: ");
        
        //leer edad
        edad = teclado.nextInt();
        
        if(edad>=4 && edad<=6) {
            System.out.println("El horario del grupo Kinder es Lunes y Miércoles de 16:00 a 17:00");
        }
        else {
            if (edad>=7 && edad<=8) {
                System.out.println("El horario del grupo First year es Martes y Jueves de 16:30 a 17:30");
            }
            else {
                if (edad>=9 && edad<=10) {
                    System.out.println("El horario del grupo Second Year es Martes y Jueves de 17:30 a 19:00");
                }
                else {
                    if (edad>=11 && edad<=13) {
                        System.out.println("El horario del  grupo Third year es Lunes y Miércoles de 17:00 a 18:30");
                    }
                    else {
                        System.out.println("La edad introducida no es correcta, por favor inténtelo de nuevo");
                    }
                }
            }
        }
        
    }
    
}
