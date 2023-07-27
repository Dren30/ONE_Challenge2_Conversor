package Conversor.Temperaturas;

public class Fahrenheit extends Temperaturas {

    public Fahrenheit(String simbolo) {
        super(simbolo);
    }

    @Override
    public double convertirACelsius(double cantidadAConvertir) {
        return (cantidadAConvertir - 32) * 5/9;

    }

    @Override
    public double convertirAFahrenheit(double cantidadAConvertir) {
        return cantidadAConvertir;
    }

    @Override
    public double convertirAKelvin(double cantidadAConvertir) {
        return (cantidadAConvertir - 32) * 5/9 + 273.15;
    }

    @Override
    public double convertirARankine(double cantidadAConvertir) {
        return cantidadAConvertir + 459.67;
    }

    
    
    
}
