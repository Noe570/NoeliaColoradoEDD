package ies;

import java.util.Scanner;

/**
 * Clase ejecutable para realizar el juego 
 * @author lanoe
 */
public class AdivinaElNumeroApp {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //Declaracion de los atributos
        int adivinar;
        int valorazar;
        int intentos = 0;
        boolean n = false;
        
        System.out.println("**************Que empieze el juego*************");
        System.out.println("******¿Seras capaz de adivinar el numero?******");
        System.out.println("***********Tendras solamente 3 intentos********");
        
        //Llamamos al metodo para generar el numero aleatorio que el usuario tendra que adivinar
        valorazar = AdivinaElNumero.ElegirNumero();
        /**
         * Hacemos dos bucles, uno para que el usuario solamente tenga 3 intentos
         * y otro para que repita si pone un numero que este fuera del rango
         */
        do{
        do{
        System.out.println("Introduce un numero del 1 hasta el 20");
        adivinar = leer.nextInt();
        if(adivinar>20){
            System.out.println("Tienes que poner un numero que sea menor o igual a 20");
        }
        }while(adivinar>=20);
        //Comprobamos el numero del usuario con el numero que se genero
        AdivinaElNumero.ComprobarResultado(adivinar, valorazar);

        intentos++;
        }while(intentos!=3 || n );  
         //Si falla los intentos le saldra este mensaje
         if(!n){
            System.out.println("Has perdido, intentalo de nuevo");
        }
    }
}
