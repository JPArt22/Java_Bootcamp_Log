
package ejemplo_dowhile;

public class Ejemplo_doWhile {


    public static void main(String[] args) {
        
        int contador = 0;
        
        do {
            
            System.out.println("Estoy en la vuelta: " + (contador+1)); /*(contador+1) para que no 
                                                                         muestre de 0 a 9, sino de 1 a 10 */
            
            //incrementar contador
            contador++; // ++ incrementa en 1 la variable contador
            
        }while(contador<10);
    }
    
}
