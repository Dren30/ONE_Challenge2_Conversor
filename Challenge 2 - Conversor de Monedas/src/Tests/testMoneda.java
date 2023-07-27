package Tests;

import Conversor.Monedas.Moneda;

/**
 *
 * @author schav
 */
public class testMoneda {
    
    public static void main(String[] args) {
        
        Moneda pesoMexicano = new Moneda(0.0584, "MXC", "$");
        Moneda pesoDominicano = new Moneda(0.0181, "DOP", "$");
        Moneda dollar = new Moneda(1, "USD", "$");
        Moneda euro = new Moneda(1.1007, "Eur", "€");
        
  
        System.out.println(euro.convertirValorLocalADestino(dollar, 112));
        System.out.println(dollar.convertirValorLocalADestino(euro, 15.452));
        System.out.println(pesoDominicano.convertirValorLocalADestino(dollar, 1242.31123132345));
        System.out.println("test2");
        
        
    }
}
