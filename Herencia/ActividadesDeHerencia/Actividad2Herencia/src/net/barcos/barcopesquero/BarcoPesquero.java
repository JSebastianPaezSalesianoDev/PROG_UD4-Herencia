package net.barcos.barcopesquero;
import java.util.Random;

import net.barcos.Barco;

public class BarcoPesquero extends Barco{
    
    private int capacidad;
    private int carga;

    public BarcoPesquero(int capacidad, int carga, String nombre, int eslora, float altura){
        super(nombre, eslora, altura);
        this.capacidad = 100;
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

    public void descargar(){
        if (this.estaAnclado) {
            this.carga = 0;
        }else{
            System.out.println("el barco debe estar anclado para descargar");
        }
    }
}
