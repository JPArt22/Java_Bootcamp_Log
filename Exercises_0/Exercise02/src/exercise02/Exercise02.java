
package exercise02;

import java.util.Scanner;


public class Exercise02 {

   
    public static void main(String[] args) {
        
        int numero;
        //int start = 1;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite el número límite");
        numero = teclado.nextInt();
        
        /*
        while (start <= numero){
            
            System.out.println((start));
            start++;
            
        }
        */
        
        for(int start = 1; start<=numero; start++){
            
            System.out.println(start);
        }
            
        
    
    
    }
}



