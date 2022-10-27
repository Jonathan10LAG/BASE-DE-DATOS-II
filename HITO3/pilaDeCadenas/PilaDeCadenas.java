package HITO3.pilaDeCadenas;

import HITO3.PilaNumeros;

public class PilaDeCadenas {
    private int max;
    private String[] pilaCad;
    private int tope;

    public PilaDeCadenas(int max)
    {
        this.max = max;
        this.tope = 0;
        pilaCad = new String [this.max + 1];
    }

    public boolean esVacio() {
        if (tope == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena(){
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int NroElem(){
        return this.tope;

    }

    public void Adicionar(String nuevoItem){
        if (this.esLlena() == false){
            this.tope = this.tope + 1;
            this.pilaCad[this.tope] = nuevoItem;
        } else {
            System.out.println("La pila de numeros esta llena.");
        }
    }

    public String eliminar(){
        String ElementoEliminado = "";
        if (!this.esVacio()) {
            ElementoEliminado = this.pilaCad[this.tope];
            this.tope = tope - 1;
            return ElementoEliminado;
        } else {
            System.out.println("La pila de numeros esta vacia");
        }
        return ElementoEliminado;
    }
    public void Mostrar() {
        String elem;
        if(this.esVacio() == true) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("\n Datos de la pila");
            PilaDeCadenas aux = new PilaDeCadenas(max);
            while (this.esVacio() == false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                System.out.println("elem: " + elem);
            }
            Vaciar(aux);
        }
    }

    public void Vaciar(PilaDeCadenas a ){
        while(a.esVacio() == false){
            Adicionar(a.eliminar());
        }

    }
}
