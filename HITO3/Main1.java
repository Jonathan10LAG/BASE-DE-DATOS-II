package HITO3;

public class Main1 {
    public static void main (String [] args ) {
        PilaNumeros P1 = new PilaNumeros(12);
        P1.Adicionar(4 );
        P1.Adicionar(7 );
        P1.Adicionar(5 );
        P1.Adicionar(23 );
        P1.Adicionar(12 );

        P1.Mostrar();
        reubicacion(P1, 5);

    }
    public static void determinanumeromayor(PilaNumeros pila){
        PilaNumeros aux= new PilaNumeros(10);
        int mayor = -1;
        int valorextraidodelapila = 0;
        while (aux.esVacio()==false){
            valorextraidodelapila = aux.eliminar();
            if (valorextraidodelapila > mayor){
                mayor = valorextraidodelapila;
            }
            aux.Adicionar(valorextraidodelapila);
        }
        aux.vaciar(aux);
        System.out.println("El numero menor de la pila es: " + mayor);
    }
    public static void determinaNumeroMenor(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros(10);
        int menor = 1000;
        int valorExtraidodelaPila = 0;

        while (!pila.esVacio()) {
            valorExtraidodelaPila = pila.eliminar();
            if (valorExtraidodelaPila < menor) {
                menor = valorExtraidodelaPila;
            }
            aux.Adicionar(valorExtraidodelaPila);
        }
        pila.vaciar(aux);
        System.out.println("El numero menor de la pila es: " + menor);
    }
    public static void determinarParesImpares(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros(10);
        int pares = 0;
        int impares = 0;
        int valorExtraidodelaPila =0;
        while(pila.esVacio() == false){
            valorExtraidodelaPila = pila.eliminar();
            if (valorExtraidodelaPila % 2 == 0){
                pares = pares +1;
            }else {
                impares = impares +1;
            }
            aux.Adicionar(valorExtraidodelaPila);
        }
        pila.vaciar(aux);
        System.out.println("cantidad pares;"+ pares);
        System.out.println("cantidad impares;"+ impares);
    }
    public static void reubicacion(PilaNumeros pila, int elemento){
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidodelaPila =0;
        while(pila.esVacio() == false){
        if (valorExtraidodelaPila ==elemento){
            aux.Adicionar(valorExtraidodelaPila);
        }
        }
        pila.vaciar(aux);
        pila.Adicionar(elemento);
        pila.Mostrar();
    }
    public static void agregarnewitemprimero(PilaNumeros pila, int elemento){
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidodelaPila =0;
        while(pila.esVacio() == false){
            valorExtraidodelaPila = pila.eliminar();
            pila.vaciar(aux);
        }
    }
}


