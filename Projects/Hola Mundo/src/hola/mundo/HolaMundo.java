
package hola.mundo;


public class HolaMundo {


    public static void main(String[] args) {
        
        System.out.println("Hello world with Java");
        
        //operación de asignación
        int edad = 22 ;
        double estatura = 1.84;
        boolean tieneCarnetDeConducir = true;  //el warning se genera porque no se usa la variable y solo estamos reservando espacio en memoria
        char letra = 'J';
        String frase = "This is the new era 2025";
        long numeroLargo = 234235445;
        
        
        System.out.println("Hola! mi edad es" + edad);
        System.out.println("Mi estatura es " + estatura);
        System.out.println("frase: " + frase);
        System.out.println("Do I have driver license? " + tieneCarnetDeConducir);
        System.out.println("What is the first letter of my name?" + letra);
        System.out.println("random number: " + numeroLargo);
        
        
  
    }
    
}
