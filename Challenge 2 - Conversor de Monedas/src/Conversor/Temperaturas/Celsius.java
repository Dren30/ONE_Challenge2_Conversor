package Conversor.Temperaturas;

public class Celsius extends  Temperaturas{

    public Celsius(String simbolo) {
        super(simbolo);
    }

    @Override
    public double convertirACelsius(double cantidadAConvertir) {
        return cantidadAConvertir;
    }

    @Override
    public double convertirAFahrenheit(double cantidadAConvertir) {
        return (cantidadAConvertir * 1.8) + 32;
    }

    @Override
    public double convertirAKelvin(double cantidadAConvertir) {
        return cantidadAConvertir + 273.15;     
    }

    @Override
    public double convertirARankine(double cantidadAConvertir) {
        return (cantidadAConvertir * 1.8) + 491.67;
    }
    
}
