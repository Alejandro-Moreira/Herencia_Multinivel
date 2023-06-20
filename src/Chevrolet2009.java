public class Chevrolet2009 extends Chevrolet {
    public Chevrolet2009() {
        System.out.println("Chevrolet Modelo: Spark");
    }

    public void Velocidad() {
        System.out.println("Velocidad Maxima: 120Kmph");
    }

    public static void main(String args[]) {
        Chevrolet2009 aut = new Chevrolet2009();
        aut.Tipo();
        aut.tipoAutomovil();
        aut.Velocidad();
    }
}
