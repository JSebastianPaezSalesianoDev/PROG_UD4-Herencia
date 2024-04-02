package net.barcos.barcoVelero;

import net.barcos.Barco;

public class BarcoVela extends Barco{

    protected int numeroVelas;

    public BarcoVela(int numeroVelas, String nombre, int eslora, float altura){
        super(nombre, eslora, altura);
        this.numeroVelas=0;
    }

    public void izarVelas(int intensidadViento){
        this.velocidad = intensidadViento/this.numeroVelas;
    }

    public void recojerVelas(){
        if (this.estaAnclado = false) {
            this.velocidad = 10f;
        }
    }

}
