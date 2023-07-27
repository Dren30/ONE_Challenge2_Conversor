package Conversor.Pesos;

import Conversor.ConversorGeneral;
        
public class Peso extends ConversorGeneral{
    
    //El valor sera determinado utilizando el Gramo(g) como punto de Referencia
    /*
        1 gramo(g) = 1 g
        1 kilogramo(kg)	= 1 000 g
        1 tonelada(t) = 1 000 000 g
        1 milligramo(mg) = 0.001 g
        1 libra (lb)= 453.59 g
        1 onza (oz) = 28.35 g
        1 carat (ct) = 0.2 g
    */
    
    public Peso(double valorEnPuntoDeReferencia, String isoCodeOAcronimo) {
        super(valorEnPuntoDeReferencia, isoCodeOAcronimo);
    }
    
}
