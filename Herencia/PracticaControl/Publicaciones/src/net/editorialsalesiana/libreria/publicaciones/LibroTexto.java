package net.editorialsalesiana.libreria.publicaciones;

import net.editorialsalesiana.libreria.Publicacion;

public class LibroTexto extends Publicacion {

    private String asignatura;
    private String[] temasArray = new String[110];

    public LibroTexto(String titulo, int numeroPaginas, String isbn, float precioDistribucion, float precioPublico,
            String fechaEdicion, String asignatura, String[] temas) {
        super(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico, fechaEdicion);
        this.asignatura = asignatura;
        this.temasArray = temas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String[] getTemasArray() {
        return temasArray;
    }

    public void setTemasArray(String[] temas) {
        this.temasArray = temas;
    }

    @Override
    public String toString() {
        String mensaje = "__________===<" + getTitulo() + ">===__________\n" +
                "*Asignatura: <" + getAsignatura() + ">\n";

        mensaje += "*Lista de temas:\n";
        for (String tema : temasArray) {
            mensaje += " \t  - " + tema + "\n";
        }

        mensaje += "*Precio de distribución: <" + getPrecioDistribucion() + ">Euros\n" +
                "*Precio de venta al publico: <" + getPrecioPublico() + ">Euros\n" +
                "========================================================";
        return mensaje;
    }

}
