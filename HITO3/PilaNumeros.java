package HITO3;

public class PilaNumeros {
    private int max;
    private int pilaNum[];
    int tope;

    public PilaNumeros(int max)
    {
        this.max = max;
        this.tope = 0;
        pilaNum = new int [this.max + 1];
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

    public void Adicionar(int nuevoItem){
        if (this.esLlena() == false){
            this.tope = this.tope + 1;
            this.pilaNum[this.tope] = nuevoItem;
        } else {
            System.out.println("La pila de numeros esta llena.");
        }
    }

    public int eliminar(){
        int ElementoEliminado = 0;
        if (!this.esVacio()) {
            ElementoEliminado = this.pilaNum[this.tope];
            this.tope = tope - 1;
            return ElementoEliminado;
        } else {
            System.out.println("La pila de numeros esta vacia");
        }
        return ElementoEliminado;
    }

    public void vaciar(PilaNumeros aux){

    }

    public void Mostrar() {
        int elem;
        if(this.esVacio() == true) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("\n Datos de la pila");
            PilaNumeros aux = new PilaNumeros(max);
            while (this.esVacio() == false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                System.out.println("elem: " + elem);
            }
            vaciar(aux);
        }
    }

    public void Vaciar(PilaNumeros a ){
        while(a.esVacio() == false){
            Adicionar(a.eliminar());
        }

    }

}
