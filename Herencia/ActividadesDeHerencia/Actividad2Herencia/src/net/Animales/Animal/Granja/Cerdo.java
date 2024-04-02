package net.Animales.Animal.Granja;

import net.Animales.Animal.Animal;

public class Cerdo extends AnimalGranja {
    
    private boolean haProducido = false;

    public Cerdo (String tipoDeAlimentacion){
        super(tipoDeAlimentacion);
    }

    public boolean isHaProducido() {
        return haProducido;
    }
    

    @Override
    public String haceRuido() {
        String mensaje = "oink!";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public void producir(){
         System.out.println("HA PRODUCIDO nose");
         if (haProducido = true) {
            System.out.println("Este cerdo ha producido");
            haProducido = true;
         }else{
            System.out.println("este cerdo ya ha producido");
            //preguntar por este a adri
         }
    }

    public String toString() {
        String mensaje = "este cerdo, ha producido  " + isHaProducido();
        return mensaje;
    }

}
