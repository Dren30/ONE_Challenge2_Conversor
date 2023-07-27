package Conversor.Temperaturas;

public class Rankine extends Temperaturas{

    public Rankine(String simbolo) {
        super(simbolo);
    }

    @Override
    public double convertirACelsius(double cantidadAConvertir) {
        return (cantidadAConvertir - 491.67) * 5/9;
    }

    @Override
    public double convertirAFahrenheit(double cantidadAConvertir) {
        return cantidadAConvertir - 459.67;
    }

    @Override
    public double convertirAKelvin(double cantidadAConvertir) {
        return cantidadAConvertir * 5/9;
    }

    @Override
    public double convertirARankine(double cantidadAConvertir) {
        return cantidadAConvertir;
    }
    
}
