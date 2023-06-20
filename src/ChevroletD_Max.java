public class ChevroletD_Max extends Chevrolet{
    public ChevroletD_Max() {
        System.out.println("Chevrolet Modelo: D-Max");
    }

    public void Velocidad() {
        System.out.println("Velocidad Maxima: 130Kmph");
    }

    public static void main(String args[]) {
        ChevroletD_Max aut = new ChevroletD_Max();
        aut.Tipo();
        aut.tipoAutomovil2();
        aut.Velocidad();
    }
}
