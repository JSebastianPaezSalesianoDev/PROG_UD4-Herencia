package net.salesianos.actividad2.barquitos;

import net.salesianos.actividad2.Barco;

public class BarcoVapor extends Barco {
    private int kgCarbon;

    public BarcoVapor(String nombre, int altura, int eslora, int kgCarbon) {
        super(nombre, altura, eslora);
        this.kgCarbon = kgCarbon;
    }

    public int getKgCarbon() {
        return kgCarbon;
    }

    public void setKgCarbon(int kgCarbon) {
        this.kgCarbon = kgCarbon;
    }

    public void echarCombustible() {
        if (!this.estaAnclado && this.kgCarbon >= 10) {

            setKgCarbon(this.kgCarbon - 10);
            setVelocidad(this.velocidad + 5);
            System.out.println("La velocidad actual es de: " + getVelocidad());

        } else if (!this.estaAnclado && this.kgCarbon < 10) {

            System.out.println("No tienes sufience combustible");

        } else if (this.estaAnclado) {

            System.out.println("Desancla el barco primero zoquete");

        }
    }

    public void apagarMotores() {
        if (this.estaAnclado) {
            System.out.println("Tienes que anclar el barco primero");
        } else {
            setVelocidad(10);
            System.out.println("Apagando motores, la velocidad actual es de: " + getVelocidad());
        }
    }
}
