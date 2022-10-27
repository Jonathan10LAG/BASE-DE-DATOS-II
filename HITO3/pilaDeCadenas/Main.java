package HITO3.pilaDeCadenas;

public class Main {
    public static void main (String [] args ) {
        PilaDeCadenas Z1 = new PilaDeCadenas(12);
        Z1.Adicionar("William");
        Z1.Adicionar("Andres");
        Z1.Adicionar("Josias");
        Z1.Adicionar("Iris");
        Z1.Adicionar("Jonathan");
        Z1.Adicionar("Pato");

        Z1.Mostrar();
    }
}
