package Conversor.Temperaturas;

public abstract class Temperaturas {
    
    private final String simbolo;
    
    public Temperaturas(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public abstract double convertirACelsius(double cantidadAConvertir);
    
    public abstract double convertirAFahrenheit(double cantidadAConvertir);
    
    public abstract double convertirAKelvin(double cantidadAConvertir);
    
    public abstract double convertirARankine(double cantidadAConvertir);
    
    public double destinoDeConversion(int indice, double cantidadAConvertir){
        
        switch (indice) {
            case 0 -> {return convertirACelsius(cantidadAConvertir);}
            case 1 -> {return convertirAFahrenheit(cantidadAConvertir);}
            case 2 -> {return convertirAKelvin(cantidadAConvertir);}
            case 3 -> {return convertirARankine(cantidadAConvertir);}
            default -> throw new AssertionError();
        }
    } 

    public String getSimbolo() {
        return simbolo;
    }
    
    
    
}