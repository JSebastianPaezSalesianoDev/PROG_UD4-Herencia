package net.salesianos.actividad2.barquitos;

import java.util.Random;

import net.salesianos.actividad2.Barco;

public class BarcoPesquero extends Barco {
    private int capacidad;
    private int carga;

    public BarcoPesquero(String nombre, int altura, int eslora, int capacidad) {
        super(nombre, altura, eslora);
        this.capacidad = capacidad;
        this.carga = 0;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void pescar() {
        if (this.estaAnclado) {
            System.out.println("El barco tiene que estar anclado");
            return;
        }

        Random random = new Random();
        int nuevaCarga = random.nextInt(90) + 10;

        if (this.carga == this.capacidad) {
            System.out.println("Ya está lleno");
        } else if ((this.carga + nuevaCarga) >= this.capacidad) {
            this.carga = this.capacidad;
            System.out.println("Se ha alcanzado máxima capacidad.");
        } else {
            this.carga += nuevaCarga;
            System.out.println("Se han pescado " + nuevaCarga + " kgs.");
        }
    }

    public void descargar() {
        if (this.estaAnclado) {
            this.carga = 0;
        } else {
            System.out.println("El barco debe estar anclado");
        }
    }
}
