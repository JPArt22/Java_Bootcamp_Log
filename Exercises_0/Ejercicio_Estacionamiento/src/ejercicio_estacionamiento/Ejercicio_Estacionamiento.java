
package ejercicio_estacionamiento;

import java.util.Scanner;


public class Ejercicio_Estacionamiento {

    
    public static void main(String[] args) {
        
        String Placa = "";
        int tipoEstacionamiento, cantidadPorHora = 0, cantidadMediaJornada = 0, cantidadJornada = 0, numeroHoras;
        double totalDinero = 0;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        

        while (!Placa.equalsIgnoreCase("Fin")){
            
            System.out.println("Ingrese la placa correspondiente a su vehículo o digite Fin para finalizar la sesión: ");
            Placa = teclado.next();
            if (Placa.equalsIgnoreCase("Fin")){
                break;      // termina el bucle si la palabra es fin
            }
            System.out.println("Los tipos de estacionamiento son: \n1: Por hora \n2: Media jornada \n3: Jornada completa");
            System.out.println("por favor, ingrese que tipo de estacionamiento tiene: ");
            tipoEstacionamiento = teclado.nextInt();
            
            if (tipoEstacionamiento <= 0 || tipoEstacionamiento > 3){
                
                System.out.println("No ingreso tipo de estacionamiento correcto");
                continue;           // Vuelve al inicio del bucle para repetir las preguntas
                
            } else {
                if (tipoEstacionamiento == 1){
                    System.out.println("¿Cuántas horas usó el servicio?");
                    numeroHoras = teclado2.nextInt();
                    totalDinero += numeroHoras*3;
                    cantidadPorHora++;

                } else {

                    if (tipoEstacionamiento == 2){
                        totalDinero += 15*0.95;         // += suma variable de la izquierda con operación 
                        cantidadMediaJornada++;         // de la izquierda y guarda en variable de la izquierda

                    } else {

                        if (tipoEstacionamiento == 3){
                            totalDinero += 30*0.90;
                            cantidadJornada++;
                        }


                    }



                }
            }
         
        }
        
    System.out.println(
    "Cantidad de estacionamientos por hora: " + cantidadPorHora + "\n" +
    "Cantidad de estacionamientos por media jornada: " + cantidadMediaJornada + "\n" +
    "Cantidad de estacionamientos por jornada: " + cantidadJornada + "\n" +
    "Cantidad total de dinero recaudado: " +  totalDinero);
    
    }
    
}
