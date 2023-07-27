package Tests;

import Conversor.Temperaturas.*;

/**
 *
 * @author schav
 */
public class testTemperaturas {
    
    public static void main(String[] args) {
        Temperaturas c = new Celsius("c");
        Temperaturas k =  new Kelvin("k");
        Temperaturas f = new Fahrenheit("f");
        Temperaturas r =  new Rankine("k");
        
        
        System.out.println(c.getClass().getSimpleName());
        System.out.println(c.convertirAFahrenheit(20));
        System.out.println(c.convertirAKelvin(20));
        System.out.println(c.convertirARankine(20));
        
        System.out.println(k.getClass().getSimpleName());
        System.out.println(k.convertirAFahrenheit(20));
        System.out.println(k.convertirACelsius(20));
        System.out.println(k.convertirARankine(20));
            
        
    }
    
    
}
