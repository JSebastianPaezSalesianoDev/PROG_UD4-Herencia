package net.barcos.barcoVapor;

import net.barcos.Barco;

public class BarcoVapor extends Barco{
    
    private int kgCarbon;

    public BarcoVapor(int kgCarbon, String nombre, int eslora, float altura, float velocidad){
        super(nombre, eslora, altura);
        this.kgCarbon = kgCarbon;
       
    }
    public void echarCombustible( ){
        
        if (kgCarbon >= 10) {
            kgCarbon = kgCarbon - 10;
            this.velocidad += 5;
        }
        
    }

    public void apagarMotores(){
        this.velocidad = 10f;
    }
}
