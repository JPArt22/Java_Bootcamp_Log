
package ejercicio_mercería;


import java.util.Scanner;


public class Ejercicio_Mercería {


    public static void main(String[] args) {
        
        //declaración de variables
        int cantidadPaquetes;
        double montoTotal, diferencia, totalDescuento;
        
        //recibir cantidad
        System.out.println("Ingrese la cantidad de paquetes a comprar");
        Scanner teclado = new Scanner(System.in);
        cantidadPaquetes = teclado.nextInt();       // ya guardó lo que se sigitó en teclado
        
        
        
        if (cantidadPaquetes<5) {
            
            System.out.println("No se permiten compras inferiores a 5 productos");
            
        }
        else {
            
            //recibit monto
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);       // reutilizamos teclado porque ya guardo cantidad
            montoTotal = teclado.nextDouble();            // actualizamos el valor de teclado
            
            if (cantidadPaquetes>=5 && cantidadPaquetes<=15){
                System.out.println("El costo del envío es de: 10 USD");
                montoTotal = montoTotal + 10;
            }
            else{
                if (cantidadPaquetes>15){
                    System.out.println("El envío es gratuito, felicidades");
                }
            }
            
            if (montoTotal<100){
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100, no hay promociones. Faltan " 
                        + diferencia + " USD para obtener un descuento");
                
            }
            else {
                if (montoTotal>=100 && montoTotal<300){
                    totalDescuento = montoTotal * 0.95;
                    System.out.println("Usted adquirió un descuento del 5%, el precio final es: " 
                            + totalDescuento + " USD");
                    
                    
                }
                else {
                    totalDescuento = montoTotal * 0.90;
                    System.out.println("Usted adquirió un descuento del 10%, el precio final es: " + totalDescuento + " USD");
                    
                }
            }
        }
        
        
    }
    
}
