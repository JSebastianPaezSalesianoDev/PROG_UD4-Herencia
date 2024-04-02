import net.salesianos.actividad2.barquitos.BarcoPesquero;
import net.salesianos.actividad2.barquitos.BarcoVapor;
import net.salesianos.actividad2.barquitos.BarcoVela;
import net.salesianos.actividad2.barquitos.BoteRecreo;

public class MainBarcos {
    public static void main(String[] args) throws Exception {

        BarcoVapor bVapor = new BarcoVapor("Barquito a vapor", 7, 12, 10);

        BarcoVela bVela = new BarcoVela("Barquito a vela", 8, 15, 6);

        BoteRecreo bRecreo = new BoteRecreo("Barquito de recreo", 4, 7, "Pepa", 24);

        BarcoPesquero bPesquero = new BarcoPesquero("Barquito pesquero", 10, 20, 1000);

        // bVapor.navegar();
        // bVapor.echarCombustible();
        // bVapor.echarCombustible();
        // bVapor.echarCombustible();
        // bVapor.anclar();
        // bVapor.echarCombustible();
        // bVapor.apagarMotores();
        // bVapor.anclar();
        // bVapor.anclar();

        // bVela.izarVelas(5);
        // bVela.anclar();
        // bVela.navegar();
        // bVela.izarVelas(5);
        // System.out.println(bVela.getVelocidad());
        // bVela.anclar();
        // bVela.recogerVelas();
        // System.out.println(bVela.getVelocidad());
        // bVela.anclar();

        bRecreo.alquilar(5, "Pepa");
        bRecreo.alquilar(5, null);
    }
}
