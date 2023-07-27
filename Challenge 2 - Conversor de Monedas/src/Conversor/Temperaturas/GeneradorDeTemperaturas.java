package Conversor.Temperaturas;

public class GeneradorDeTemperaturas {
    
    /*
     0 = Celsius (°C)
     1 = Fahrenheit (°F)
     2 = Kelvin (K)
     3 = Rankine (°R)
    */
    
    public static Temperaturas GenerarTemperatura(int indice){
        
        Temperaturas temperaturaParaRetornar;
        
        switch (indice) {
            case 0 -> temperaturaParaRetornar = new Celsius("°C");
            case 1 -> temperaturaParaRetornar = new Fahrenheit("°F");
            case 2 -> temperaturaParaRetornar = new Kelvin("K");
            case 3 -> temperaturaParaRetornar = new Rankine("°R");
            default -> throw new AssertionError();
        }
        
        return  temperaturaParaRetornar;
    }
}
