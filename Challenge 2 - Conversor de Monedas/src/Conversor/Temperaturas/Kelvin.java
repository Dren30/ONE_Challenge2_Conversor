package Conversor.Temperaturas;

public class Kelvin extends Temperaturas{

    public Kelvin(String simbolo) {
        super(simbolo);
    }

    @Override
    public double convertirACelsius(double cantidadAConvertir) {
        return cantidadAConvertir - 273.15;     
 
    }

    @Override
    public double convertirAFahrenheit(double cantidadAConvertir) {
        return (cantidadAConvertir - 273.15) * 1.8 + 32;
    }

    @Override
    public double convertirAKelvin(double cantidadAConvertir) {
        return cantidadAConvertir;
    }

    @Override
    public double convertirARankine(double cantidadAConvertir) {
        return cantidadAConvertir * 1.8;
    }
    
    
}
