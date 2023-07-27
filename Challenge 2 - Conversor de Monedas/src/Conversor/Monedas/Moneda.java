package Conversor.Monedas;

import Conversor.ConversorGeneral;

public class Moneda extends ConversorGeneral{
    
    //El valor sera determinado utilizando el Dólar estadounidense (USD) como punto de Referencia

    private final String simbolo;
    
    public Moneda(double valorEnPuntoDeReferencia, String isoCodeOAcronimo, String simbolo) {
        super(valorEnPuntoDeReferencia, isoCodeOAcronimo);
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }


    
    
    
}
