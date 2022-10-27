package HITO3.PilaDeLibros;

import HITO3.PilaNumeros;

public class PilaDeLibros {
        private int max;
        private  Libro[] libros;
        int tope;

        public PilaDeLibros(int max)
        {
            this.max = max;
            this.tope = 0;
            this.libros = new Libro [this.max + 1];
        }

        public boolean esVacio() {
            if (this.tope == 0){
                return true;
            } else {
                return false;
            }
        }

        public boolean esLlena(){
            if (this.tope == this.max) {
                return true;
            } else {
                return false;
            }
        }

        public int NroElem(){
            return this.tope;

        }

        public void Adicionar(Libro nuevoLibro){
            if (this.esLlena() == false){
                this.tope = this.tope + 1;
                this.libros[this.tope] = nuevoLibro;
            } else {
                System.out.println("La pila de numeros esta llena.");
            }
        }

        public Libro eliminar(){
            Libro ElementoEliminado = null;
            if (!this.esVacio()) {
                ElementoEliminado = this.libros[this.tope];
                this.tope = tope - 1;
                return ElementoEliminado;
            } else {
                System.out.println("La pila de numeros esta vacia");
            }
            return ElementoEliminado;
        }

        public void vaciar(HITO3.PilaNumeros aux){

        }

        public void Mostrar() {
            Libro elem;
            if(this.esVacio() == true) {
                System.out.println("La pila esta vacia");
            } else {
                System.out.println("\n Datos de la pila");
                PilaDeLibros aux = new PilaDeLibros(max);
                while (this.esVacio() == false){
                    elem = this.eliminar();
                    aux.Adicionar(elem);
                    elem.mostrarLibro();
                }
                vaciar(aux);
            }
        }

        public void vaciar(PilaDeLibros pila){
            while(pila.esVacio() == false){
                Adicionar(pila.eliminar());
            }

        }


}



