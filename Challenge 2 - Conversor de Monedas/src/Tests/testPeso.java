/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Conversor.Pesos.Peso;

/**
 
1 tonelada(t) = 1 000 000 g
1 kilogramo(kg)	= 1 000 g
1 gramo(g) = 1 g
1 milligramo(mg) = 0.001 g
1 microgramo(µg)	=0.000 001 g
1 nanogramo(ng)	= 0.000 000 001 g
1 picogramo(pg)	= 0.000 000 000 001g
* 
 */
 
public class testPeso {
    
    public static void main(String[] args) {
        Peso gramo = new Peso(1, "g");
        Peso miligramo = new Peso(0.001, "mg");
        Peso kilogramo = new Peso(1000, "kg");
        
        
        System.out.println(gramo.convertirValorLocalADestino(gramo,123));
        System.out.println(miligramo.convertirValorLocalADestino(gramo ,1000));
        System.out.println(kilogramo.convertirValorLocalADestino(gramo, 2));
    }
    
}
