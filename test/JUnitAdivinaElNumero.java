

import ies.AdivinaElNumero;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lanoe
 */
public class JUnitAdivinaElNumero {
    /**
     * Declaramos los atributos necesarios
     */
    private static int numeroObtenido;
    
    /**
     * Metodo para rellenar un atributo con un numero al azar 
     * entre el 1 y el 20
     */
    @BeforeClass
    public static void crearNumero(){
        
    numeroObtenido = AdivinaElNumero.ElegirNumero();
  
    }
    /**
     * Metodo para comprobar que los resultados del juego estan bien
     */
    @Test
    public void comprobarNumero(){
        //Declaramos los atributos que necesitaremos.
        int esper = 5;
        int esper2 = 25;
       //Comparamos el resultado esperado, con el resultado obtenido
        Assert.assertEquals(esper, numeroObtenido);
        Assert.assertEquals(esper2, numeroObtenido);
    }
    
    
    
}
