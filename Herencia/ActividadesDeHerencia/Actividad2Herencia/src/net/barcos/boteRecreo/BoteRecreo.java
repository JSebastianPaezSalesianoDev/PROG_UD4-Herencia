package net.barcos.boteRecreo;

import net.barcos.Barco;

public class BoteRecreo extends Barco {

    protected String nombreCliente;
    protected int precioHora;

    public BoteRecreo(String nombreCliente, int precioHora, String nombre, int eslora, float altura) {
        super(nombre, eslora, altura);
        this.nombreCliente = nombreCliente;
        this.precioHora = precioHora;

    }

    public void alquilar() {
        if (estaAnclado = true) {

            System.out.println("El barco " + this.nombre + " ha sido alquilado a nombre de " + this.nombreCliente
                    + " por " + this.precioHora + "euros");

        }
    }

    public void devolver() {
        if (estaAnclado = true) {
            System.out.println("el barco " + this.nombre + " ha sido devuelto por " + this.nombreCliente);
        } else {
            System.out.println("El barco debe estar anclado para devolverlo");
        }
    }
}
