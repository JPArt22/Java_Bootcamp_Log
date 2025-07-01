
package exercise_3;

import java.util.Scanner;


public class Exercise_3 {


    public static void main(String[] args) {
        
        int numero = 250;
        //int start = 1;
        //Scanner teclado = new Scanner(System.in);
        
        
        //System.out.println("Digite el número límite");
        //numero = teclado.nextInt();
        
        
        for(int start = 200; start<=numero; start++){
            
            if (start%2 == 0){
                System.out.println(start);
            }
        }
    }
    
}
