package Conversor.Monedas;

public class GeneradorDeMonedas {

    /*
     0 = Peso dominicano (DOP)
     1 = Dólar estadounidense (USD)
     2 = Euro (EUR)
     3 = Libra esterlina (GBP)
     4 = Yen (JPY)
     5 = Won surcoreano (KRW)
     6 = Peso argentino  (ARS)
     7 = Peso mexicano (MXN )
     8 = Peso colombiano (COP )
    */
    
    public static Moneda GenerarMoneda(int indice){
        
        Moneda monedaParaRetornar;
        
        switch (indice) {
            case 0 -> monedaParaRetornar = new Moneda(0.0181, "DOP", "$");
            case 1 -> monedaParaRetornar = new Moneda(1, "USD", "$");
            case 2 -> monedaParaRetornar = new Moneda(1.1007, "Eur", "€");
            case 3 -> monedaParaRetornar = new Moneda(1.3028, "GBP", "£");
            case 4 -> monedaParaRetornar = new Moneda(0.0072, "JPY", "¥");
            case 5 -> monedaParaRetornar = new Moneda(0.00079, "KRW", "₩");
            case 6 -> monedaParaRetornar = new Moneda(0.0037, "ARS", "$");
            case 7 -> monedaParaRetornar = new Moneda(0.0584, "MXN", "$");
            case 8 -> monedaParaRetornar = new Moneda(0.00025, "COP", "$");
            default -> throw new AssertionError();
        }
        
        return  monedaParaRetornar;
        
    }

}
