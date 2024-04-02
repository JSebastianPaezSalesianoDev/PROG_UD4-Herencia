

import net.Animales.Animal.Domestico.Gato;
import net.Animales.Animal.Domestico.Loro;
import net.Animales.Animal.Domestico.Perro;
import net.Animales.Animal.Granja.Cerdo;
import net.Animales.Animal.Granja.Gallina;
import net.Animales.Animal.Granja.Vaca;

public class AnimalEjecutable {

    public static void main(String[] args) {

        Gato gatitagrr = new Gato( "kitty" ,"atun");
        Loro loron = new Loro("lorito","maiz");
        Perro perron = new Perro("hueson", "huesos");
        Cerdo pepa = new Cerdo("humanos");
        Gallina isra = new Gallina("masmaiz");
        Vaca lola = new Vaca("Trigo");

        gatitagrr.haceRuido();
        loron.haceRuido();
        perron.haceRuido();
        pepa.haceRuido();
        isra.haceRuido();
        lola.haceRuido();

        System.out.print("Gallina ");
        isra.producir();
        isra.producir();
        isra.producir();
        isra.producir();
        
        lola.producir();
        pepa.producir();

        loron.volar("pepe");

        System.out.println(gatitagrr.toString());
        System.out.println(perron.toString());
        System.out.println(loron.toString());
        System.out.println(lola.toString());
        System.out.println(pepa.toString());
        System.out.println(isra.toString());
        // preguntar a  adri por el loro volar no se cumple el return false y creo que lo mismo con el cerdo.


        System.out.println(loron.volar("pepa"));
    }

}
