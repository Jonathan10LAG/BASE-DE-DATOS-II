package HITO3.PilaDeLibros;

import javax.sound.midi.VoiceStatus;

public class Main {
        public static void main(String [] args){
        Libro lib1 = new Libro("La Odisea", "Homero", 40, 20.50, "Novela");
        Libro lib2 = new Libro("Justice League", "Zack Snyder", 320, 79.99, "Sci-Fic");
        Libro lib3 = new Libro("High School DxD", "Ichiei Ishibumi", 754, 45.99, "Light Novel");
        Libro lib4 = new Libro("Dragon Ball Z", "Akira Toriyama", 50, 1.99, "Manga");
        Libro lib5 = new Libro("La mano de D10S", "Rodrigo", 359, 34.70, "Biografia");

        PilaDeLibros Libro = new PilaDeLibros(10);

        Libro.Adicionar(lib1);
        Libro.Adicionar(lib2);
        Libro.Adicionar(lib3);
        Libro.Adicionar(lib4);
        Libro.Adicionar(lib5);

        Libro.Mostrar();
        LIbroMayorPaginas(Libro, 50);
        CambiarSentido(Libro);
    }

    public static void LIbroMayorPaginas(PilaDeLibros libros, int NumeroPagina){
        PilaDeLibros aux = new PilaDeLibros(50);
        int mayor = 0;
        int cont = 0;
        Libro ValorExtraidoDePila = null;
        while(libros.esVacio()==false){
            ValorExtraidoDePila = libros.eliminar();
            if(ValorExtraidoDePila.getNroPag() > NumeroPagina){
                cont = cont + 1;
            }

            aux.Adicionar(ValorExtraidoDePila);
        }

        libros.vaciar(aux);

        System.out.println("Cantidad de libros con paginas mayores a 50: " + cont);
    }

    public static void CambiarSentido(PilaDeLibros libros){
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro ValorEliminado = libros.eliminar();
        Libro ValorEliminado2 = null;
        Libro PrimerLibroEliminado = null;
        while(!libros.esVacio()){
            ValorEliminado2 = libros.eliminar();
            aux.Adicionar(ValorEliminado2);
        }
        PrimerLibroEliminado = aux.eliminar();
        aux.Adicionar(ValorEliminado);
        libros.vaciar(aux);
        libros.Adicionar(PrimerLibroEliminado);
        libros.Mostrar();

    }
}


