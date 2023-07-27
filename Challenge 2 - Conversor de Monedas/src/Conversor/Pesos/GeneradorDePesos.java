package Conversor.Pesos;

public class GeneradorDePesos {
    
    /*
     0 = Gramos (g)
     1 = Kilogramo (kg)
     2 = Tonelada (t)
     3 = Milligramo (mg)	
     4 = Libras (lb)
     5 = Onza (oz)
     6 = Carat (ct)
    */
    
    public static Peso GenerarPeso(int indice) {
        
        Peso pesoParaRetornar;
        
        switch (indice) {
            case 0 -> pesoParaRetornar = new Peso(1, "g");
            case 1 -> pesoParaRetornar = new Peso(1000, "kg");
            case 2 -> pesoParaRetornar = new Peso(1000000, "t");
            case 3 -> pesoParaRetornar = new Peso(0.001,"mg");
            case 4 -> pesoParaRetornar = new Peso(453.59, "lb");
            case 5 -> pesoParaRetornar = new Peso(28.35, "oz");
            case 6 -> pesoParaRetornar = new Peso(0.2, "ct");
            default -> throw new AssertionError();
        }
        
        return  pesoParaRetornar;
        
    }
   
}
