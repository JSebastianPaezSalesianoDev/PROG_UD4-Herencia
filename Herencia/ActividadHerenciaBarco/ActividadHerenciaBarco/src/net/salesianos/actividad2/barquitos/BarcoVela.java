package net.salesianos.actividad2.barquitos;

import net.salesianos.actividad2.Barco;

public class BarcoVela extends Barco {
    private int numeroVelas;

    public BarcoVela(String nombre, int altura, int eslora, int numeroVelas) {
        super(nombre, altura, eslora);
        this.numeroVelas = numeroVelas;
    }

    public int getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(int numeroVelas) {
        this.numeroVelas = numeroVelas;
    }

    public void izarVelas(int intensidadViento) {
        if (!this.estaAnclado) {
            setVelocidad(10 + (intensidadViento * getNumeroVelas()));
        } else {
            System.out.println("Desancla el barco primero");
        }
    }

    public void recogerVelas() {
        if (!this.estaAnclado) {
            setVelocidad(10);
        } else {
            System.out.println("Desancla el barco primero");
        }
    }
}
