package net.salesianos.actividad2.barquitos;

import net.salesianos.actividad2.Barco;

public class BoteRecreo extends Barco {
    private String nombreCliente;
    private int precioHora;

    public BoteRecreo(String nombre, int altura, int eslora, String nombreCliente, int precioHora) {
        super(nombre, altura, eslora);
        this.nombreCliente = nombreCliente;
        this.precioHora = precioHora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public void alquilar(int numeroHoras, String nombreCliente) {

        if (this.estaAnclado) {

            setNombreCliente(nombreCliente);
            System.out.println(
                    "El barco: " + getNombre() + " ha sido alquilado a nombre de " + getNombreCliente() + " por "
                            + numeroHoras + " horas por un precio de "
                            + (numeroHoras * getPrecioHora())
                            + " euros");
        } else {
            System.out.println("El barco debe estar anclado");
        }
    }

    public void devolver(String nombre) {

        if (this.estaAnclado) {

            System.out.println("El barco: " + getNombre() + "ha sido devuelto por el cliente: " + getNombreCliente());

        } else {
            System.out.println("El barco debe estar anclado");
        }
    }
}
