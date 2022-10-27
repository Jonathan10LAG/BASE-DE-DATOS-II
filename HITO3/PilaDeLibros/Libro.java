package HITO3.PilaDeLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int nroPag;
    private double precio;
    private String categoria;

    public Libro(String titulo, String autor, int nroPag, double precio, String categoria){

        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        this.categoria = categoria;
    }

    //GETTERS

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    // SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarLibro() {
        System.out.println("\nMostrando LIBRO");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Nro de Paginas: " + this.getNroPag());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Categoria: " + this.getCategoria());
    }
}
