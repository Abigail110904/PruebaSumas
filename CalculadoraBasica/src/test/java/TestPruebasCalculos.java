/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.calculadorabasica.Calculos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abigailsoto
 */
public class TestPruebasCalculos {
    
    public TestPruebasCalculos() {
    }
   Calculos instancia=new Calculos ();
   @Test
   public void pruebasuma1(){
       int x=4;
       int y=2;
       int esperado=6;
       int obtenido=instancia.suma(x, y);
       assertEquals(esperado, obtenido);
   }
    @Test
   public void pruebasuma2(){
       int x=6;
       int y=8;
       int esperado=14;
       int obtenido=instancia.suma(x, y);
       assertEquals(esperado, obtenido);
   }
   @Test
   public void pruebasuma3(){
       int x=8;
       int y=8;
       int esperado=16;
       int obtenido=instancia.suma(x, y);
       assertEquals(esperado, obtenido);
   }
      @Test
   public void pruebasuma4(){
       int x=21;
       int y=9;
       int esperado=30;
       int obtenido=instancia.suma(x, y);
       assertEquals(esperado, obtenido);
   }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
