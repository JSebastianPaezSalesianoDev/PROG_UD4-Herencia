import net.ikeasalesiano.electrodomesticos.Microondas;
import net.ikeasalesiano.electrodomesticos.Nevera;

public class EjecutableElectrodomesticos {
    
    public static void main(String[] args) {
        
        Nevera neveron = new Nevera("xiaomi", "38b", 37.0f, 5.7f, 45f);

        neveron.EncenderElectrodomestico();
        System.out.println(neveron.toString());

        
        neveron.apagarElectrodomestico();
        System.out.println(neveron.toString());

        Microondas microson = new Microondas("lg", "3rt", 30.5f, 22.4f, false);
        microson.cerrarPuerta();
        microson.EncenderElectrodomestico();
        System.out.println(microson.toString());
        
        Microondas microsonson = new Microondas("lgtb", "3rt", 30.5f, 22.4f, false);
        microson.apagarElectrodomestico();
        microson.cerrarPuerta();

        System.out.println(microsonson.toString());
    }
    
}
