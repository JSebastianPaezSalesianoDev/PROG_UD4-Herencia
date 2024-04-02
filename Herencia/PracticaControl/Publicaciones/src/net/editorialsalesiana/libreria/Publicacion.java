package net.editorialsalesiana.libreria;

public class Publicacion {

    protected String titulo;
    protected int numeroPaginas;
    protected String isbn;
    protected float precioDistribucion;
    protected float precioPublico;
    protected String fechaEdicion;

    public Publicacion(String titulo, int numeroPaginas, String isbn, float precioDistribucion, float precioPublico,
            String fechaEdicion) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.precioDistribucion = precioDistribucion;
        this.precioPublico = precioPublico;
        this.fechaEdicion = fechaEdicion;
    }

    public Publicacion(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public Publicacion() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecioDistribucion() {
        return this.precioDistribucion;
    }

    public void setPrecioDistribucion(float precioDistribucion) {
        this.precioDistribucion = precioDistribucion;
    }

    public String getFechaEdicion() {
        return this.fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public float getPrecioPublico() {
        return this.precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

}
