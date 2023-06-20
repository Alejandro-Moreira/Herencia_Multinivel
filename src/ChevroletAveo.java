public class ChevroletAveo extends Chevrolet{
    public ChevroletAveo(){
        System.out.println("Chevrolet Modelo: Aveo");
    }
    public void velocidad(){
        System.out.println("Velocidad Maxima: 90kmph");
    }
    public static void main(String args[]) {
        ChevroletAveo aut = new ChevroletAveo();
        aut.Tipo();
        aut.tipoAutomovil();
        aut.velocidad();
    }
}
// Preguntas
// a) 3 puede tener acceso a algo de 9
// No 3 no tiene acceso a 9, pero si tiene acceso a 1 al igual que nueve lo que implica que comparten informacion de la clase padre.
// b) 9 tiene acceso a algo de 7
// Si 9 tiene acceso a 7, lo que puede implicar que este usando sus variables de forma que se heredan a lo largo del codigo.
// c) 9 hereda algo de 1
// Si 9 hereda cosas o atributos de 1 y 7, mientras que 7 solo hereda atributos de 1, haciendo referencia a abuelo-padre-hijo.
// d) 6 hereda algo de 3
// No 6 no hereda nada de 3, pero los 2 heredan algo de 1.
// e) 8 tiene acceso a 1
// Si 8 tiene acceso a 1, ya que 1 es la clase principal del programa, es decir que las demas clases heredan atributos suyos.