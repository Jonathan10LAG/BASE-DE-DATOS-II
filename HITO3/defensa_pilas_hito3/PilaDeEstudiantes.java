package HITO3.defensa_pilas_hito3;

import HITO3.PilaDeLibros.Libro;
import HITO3.PilaDeLibros.PilaDeLibros;

public class PilaDeEstudiantes {
    private int max;
    private  Estudiante[] estudent;
    int tope;

    public PilaDeEstudiantes(int max)
    {
        this.max = max;
        this.tope = 0;
        this.estudent = new Estudiante [this.max + 1];
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

    public void Adicionar(Estudiante nuevoEstudiante){
        if (this.esLlena() == false){
            this.tope = this.tope + 1;
            this.estudent[this.tope] = nuevoEstudiante;
        } else {
            System.out.println("La pila de numeros esta llena.");
        }
    }

    public Estudiante eliminar(){
        Estudiante EstudianteExpulsado = null;
        if (!this.esVacio()) {
            EstudianteExpulsado = this.estudent[this.tope];
            this.tope = tope - 1;
            return EstudianteExpulsado;
        } else {
            System.out.println("La pila de numeros esta vacia");
        }
        return EstudianteExpulsado;
    }
    public void Mostrar() {
        Estudiante elem;
        if(this.esVacio() == true) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("\n Datos de la pila");
            PilaDeEstudiantes aux = new PilaDeEstudiantes(max);
            while (this.esVacio() == false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                elem.MostrarEstudiante();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeEstudiantes student){
        while(student.esVacio() == false){
            Adicionar(student.eliminar());
        }

    }
}
