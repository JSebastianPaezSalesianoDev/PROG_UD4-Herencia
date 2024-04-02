package net.editorialsalesiana.libreria.publicaciones;

import net.editorialsalesiana.libreria.Publicacion;

public class Novela extends Publicacion {

    private Tematica tematica;
    private String autor;

    public Novela(String titulo, int numeroPaginas, String isbn, float precioDistribucion, float precioPublico,
            String fechaEdicion, String autor, Tematica tematica) {
        super(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico, fechaEdicion);
        this.autor = autor;
        this.tematica = tematica;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String mensaje = "__________===<" + getTitulo() + ">===__________\n";
        mensaje += "*Tematica: <" + tematica + ">\n" + "*Autor: <" + getAutor() + ">\n" +
                "*Numero de paginas: <" + getNumeroPaginas() + ">\n" + "*Precio de distribucion: <"
                + getPrecioDistribucion() + ">Euros" +
                "\n*Precio de venta al publico: <" + getPrecioPublico() + ">Euros";

        return mensaje;
    }

}
