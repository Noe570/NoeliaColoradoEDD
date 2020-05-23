
package ies;

/**
 * Clase no ejecutable para realizar el juego
 * @author lanoe
 */

public class AdivinaElNumero {
    
    /**
     * Metodo para generar un numero al azar para que el usuario lo adivine
     * 
     * @return tiene que devolver un numero entero
     */
    public static int ElegirNumero(){
        
       int numero = (int) (Math.random()*20)+1;
        
       return numero;
    }
    
    /**
     * Metodo para comprobar que el numero que introduzca el usuario se
     * corresponde con el numero generado aleatoriamente
     * @param numero el numero que se ha realizado en al eleguirlo al azar
     * @param resultado el numero que introduce el usuario para adivinar el usario
     */
    
    public static void ComprobarResultado(int numero, int resultado){
        
        if(resultado==numero){
            System.out.println("¡FELICIDADES, HAS ACERTADO EL NUMERO!");
        }
        else if(resultado>numero){
            System.out.println("No has acertado el numero, el numero que buscas es mayor"); 
        }
        else if(resultado<numero){
            System.out.println("No has acertado el numero, el numero que buscas es menor");
        }
        
    }

   
    
    
    
}
