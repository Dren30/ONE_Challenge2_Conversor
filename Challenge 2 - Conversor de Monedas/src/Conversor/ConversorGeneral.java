package Conversor;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class ConversorGeneral {

    //El valor que sera utilizado como punto de referencia, se especificara en cada clase hija
    private double valorlocalEnPuntoDeReferencia;
    private final String isoCodeOAcronimo;
    
    public ConversorGeneral(double valorEnPuntoDeReferencia, String isoCodeOAcronimo){
        
        this.valorlocalEnPuntoDeReferencia = valorEnPuntoDeReferencia;
        this.isoCodeOAcronimo = isoCodeOAcronimo;
    }


    private double convertirLocalAPuntoDeReferencia(double cantidadAconvertir) {
        return cantidadAconvertir * getValorlocalEnPuntoDeReferencia();

    }

    public double convertirPuntoDeReferenciaALocal(double cantidadAconvertir) {
        return cantidadAconvertir / this.getValorlocalEnPuntoDeReferencia();
    }

    public double convertirValorLocalADestino(ConversorGeneral puntoDestino, double cantidadAconvertir) {
        double localEnPuntoDeReferencia = this.convertirLocalAPuntoDeReferencia(cantidadAconvertir);
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(df.format(puntoDestino.convertirPuntoDeReferenciaALocal(localEnPuntoDeReferencia))); 
    }

    /**
     * @return the valorlocalEnPuntoDeReferencia
     */
    public double getValorlocalEnPuntoDeReferencia() {
        return valorlocalEnPuntoDeReferencia;
    }

    /**
     * @param valorlocalEnPuntoDeReferencia the valorlocalEnPuntoDeReferencia to set
     */
    public void setValorlocalEnPuntoDeReferencia(double valorlocalEnPuntoDeReferencia) {
        this.valorlocalEnPuntoDeReferencia = valorlocalEnPuntoDeReferencia;
    }

    /**
     * @return the isoCodeOAcronimo
     */
    public String getIsoCodeOAcronimo() {
        return isoCodeOAcronimo;
    }

    
    

    
}






