package net.editorialsalesiana.libreria.publicaciones;

import net.editorialsalesiana.libreria.Publicacion;

public class Revista extends Publicacion {

    private int numeroRevista;
    private String[] nombresArticulos = new String[100];

    public Revista(String titulo, int numeroPaginas, String isbn, float precioDistribucion, float precioPublico,
            String fechaEdicion, int numeroRevista, String[] nombresArticulos) {
        super(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico, fechaEdicion);
        this.numeroRevista = numeroRevista;
        this.nombresArticulos = nombresArticulos;
    }

    public int getNumeroRevista() {
        return this.numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String[] getNombreArticulo() {
        return this.nombresArticulos;
    }

    public void setNombresArticulos(String[] nombresArticulos) {
        this.nombresArticulos = nombresArticulos;
    }

    @Override
    public String toString() {

        String mensaje = "__________===<" + getTitulo() + ">===__________\n" + "*Numero de revista: <"
                + getNumeroRevista() + ">\n" +
                "*Lista de articulos: \n";

        for (String titulosArticulos : nombresArticulos) {
            mensaje += " \t  - " + titulosArticulos + "\n";
        }

        mensaje += "*Precio de distribucion: <" + getPrecioDistribucion() + ">Euros\n"
                + "*Precio de venta al publico: <"
                + getPrecioPublico() +
                ">Euros\n ========================================================";
        return mensaje;
    }
}
