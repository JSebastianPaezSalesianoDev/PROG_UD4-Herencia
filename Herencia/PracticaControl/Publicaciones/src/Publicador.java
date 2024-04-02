import java.util.Scanner;

import net.editorialsalesiana.gestion.gestor.Gestor;
import net.editorialsalesiana.gestion.menu.Menu;
import net.editorialsalesiana.libreria.publicaciones.LibroTexto;
import net.editorialsalesiana.libreria.publicaciones.Novela;
import net.editorialsalesiana.libreria.publicaciones.Revista;

public class Publicador {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Menu menu = new Menu();

        boolean seguir = true;

        // crear gestor y poner los arrays ahi y crear el objeto aqui

        while (seguir) {
            menu.llamarMenu();
            String opcion = lector.nextLine();

            switch (opcion) {
                case "a":
                    Revista revista = Gestor.añadirRevista();
                    System.out.println(revista.getTitulo() + " ha sido agregada");
                    break;

                case "b":
                    LibroTexto librito = Gestor.añadirLibro();
                    System.out.println(librito.getTitulo() + " ha sido agregado");
                    break;

                case "c":
                    Novela novelita = Gestor.añadirNovela();
                    System.out.println(novelita.getTitulo() + " Ha sido agregada");
                    break;

                case "d":
                    Gestor.mostrarPublicaciones();
                    break;
                case "e":
                    Gestor.calcularImpuestos();
                    break;
                case"f":
                    seguir = false;
                    break;
                default:
                    break;
            }
        }

        lector.close();
    }
}
