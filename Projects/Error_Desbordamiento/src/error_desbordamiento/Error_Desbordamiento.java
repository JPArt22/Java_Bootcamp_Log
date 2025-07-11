
package error_desbordamiento;


public class Error_Desbordamiento {


    public static void main(String[] args) {
        
        int vector[] = new int[3];
        vector[0] = 12;
        vector[1] = 23;
        vector[2] = 45;
        
        for (int i = 0; i < 4; i++){
            
            System.out.println("Valor: "+ vector[i]);
        }
    }
    
}
