package net.editorialsalesiana.gestion.gestor;

import java.util.Scanner;

import net.editorialsalesiana.gestion.impuestos.insulares.ImpuestoCanario;
import net.editorialsalesiana.gestion.impuestos.peninsulares.ImpuestoPeninsula;
import net.editorialsalesiana.libreria.Publicacion;
import net.editorialsalesiana.libreria.publicaciones.LibroTexto;
import net.editorialsalesiana.libreria.publicaciones.Novela;
import net.editorialsalesiana.libreria.publicaciones.Revista;
import net.editorialsalesiana.libreria.publicaciones.Tematica;

public class Gestor {
    private static Publicacion[] publicaciones = new Publicacion[100];

    public static Revista añadirRevista() {
        Scanner scannerr = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la revista");
        String titulo = scannerr.nextLine();

        System.out.println("Cuantas paginas tendra?");
        int numeroPaginas = scannerr.nextInt();
        scannerr.nextLine();

        System.out.println("Ingrese un isbn");
        String isbn = scannerr.nextLine();

        System.out.println("Ingrese un precio de distribucion");
        float precioDistribucion = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese un precio publico");
        float precioPublico = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese una fecha de edicion");
        String fechaEdicion = scannerr.nextLine();

        System.out.println("Ingrese el numero de la revista");
        int numeroRevista = scannerr.nextInt();
        scannerr.nextLine();

        System.out.println("Ingrese el nombre de los articulos separados por comas (,)");
        String nombresArticulosSplit = scannerr.nextLine();
        String[] nombresArticulos = nombresArticulosSplit.split(",");

        Revista nuevaRevista = new Revista(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico,
                fechaEdicion,
                numeroRevista, nombresArticulos);
        for (int i = 0; i < publicaciones.length; i++) {
            if (publicaciones[i] == null) {
                publicaciones[i] = nuevaRevista;
                System.out.println("Revista agregada");
                break;
            }
        }

        if (publicaciones.length == 99) {
            scannerr.close();
        }
        return nuevaRevista;
    }

    public static Novela añadirNovela() {
        Scanner scannerr = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la novela");
        String titulo = scannerr.nextLine();

        System.out.println("Cuantas paginas tendra?");
        int numeroPaginas = scannerr.nextInt();
        scannerr.nextLine();

        System.out.println("Ingrese un isbn");
        String isbn = scannerr.nextLine();

        System.out.println("Ingrese un precio de distribucion");
        float precioDistribucion = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese un precio publico");
        float precioPublico = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese una fecha de edicion");
        String fechaEdicion = scannerr.nextLine();

        System.out.println("Ingrese el nombre de el/la autor/a");
        String autor = scannerr.nextLine();

        Tematica tematica = null;
 
        while (tematica == null) {
            System.out.println(
                    "Que tipo de tematica tendra esta novela?\n \t 1) Negra\n\t 2) Historica\n\t 3) Juvenil\n" +
                            "Por favor ingrese el numero de la tematica que gustaria elegir");
            int tematicaOpcionNumero = scannerr.nextInt();
            scannerr.nextLine();

            switch (tematicaOpcionNumero) {
                case 1:
                    tematica = Tematica.NEGRA;
                    break;
                case 2:
                    tematica = Tematica.HISTORICA;
                    break;
                case 3:
                    tematica = Tematica.JUVENIL;
                    break;
                default:
                    System.out.println(
                            "Por favor, ingrese alguno de los numeros dados antes segun la tematica que quiera");
                    break;
            }
        }

        Novela novelita = new Novela(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico,
                fechaEdicion, autor, tematica);

        for (int i = 0; i < publicaciones.length; i++) {
            if (publicaciones[i] == null) {
                publicaciones[i] = novelita;
                System.out.println("Novela agregada");
                break;
            }
        }

        if (publicaciones.length == 99  ) {
            System.out.println("Son demasiadas novelas, por favor revise su colección");
            System.exit(0);
            scannerr.close();
        }
        return novelita;
    }

    public static LibroTexto añadirLibro() {

        Scanner scannerr = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro");
        String titulo = scannerr.nextLine();

        System.out.println("Cuantas paginas tendra?");
        int numeroPaginas = scannerr.nextInt();
        scannerr.nextLine();

        System.out.println("Ingrese un isbn");
        String isbn = scannerr.nextLine();

        System.out.println("Ingrese un precio de distribucion");
        float precioDistribucion = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese un precio publico");
        float precioPublico = scannerr.nextFloat();
        scannerr.nextLine();

        System.out.println("Ingrese una fecha de edicion");
        String fechaEdicion = scannerr.nextLine();

        System.out.println("Ingrese el nombre de la asignatura");
        String nombreAsignatura = scannerr.nextLine();

        System.out.println("Que temas tendra, ingrese sus temas separados por comas (,)?");
        String temas = scannerr.nextLine();
        String[] temasArray = temas.split(",");
        LibroTexto librito = new LibroTexto(titulo, numeroPaginas, isbn, precioDistribucion, precioPublico,
                fechaEdicion, nombreAsignatura, temasArray);

        for (int i = 0; i < publicaciones.length; i++) {
            if (publicaciones[i] == null) {
                publicaciones[i] = librito;
                System.out.println("librito agregada");
                break;
            }
        }

        if (temasArray.length== 99) {  
            System.out.println("Son demasiados temas pa un libro");
            System.exit(0);
            scannerr.close();
        }
        return librito;
    }

    public static void mostrarPublicaciones() {
        System.out.println("Lista de publicaciones:");
        for (Publicacion publicaciones : Gestor.publicaciones) {
            if (publicaciones != null) {
                System.out.println(publicaciones.toString());
            }
        }

    }

    public static void calcularImpuestos() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn de la obra de la cual quiere saber los impuestos?"); 
        String opcionUsuario = scanner.nextLine();

        

        String mensajePublicaciones = "";
        

        for (int i = 0; i < publicaciones.length; i++) {
            if (publicaciones[i] != null && opcionUsuario.equalsIgnoreCase(publicaciones[i].getIsbn())) {
                float impuesto1 = ImpuestoPeninsula.sacarIva(publicaciones[i].getPrecioPublico());
                float impuesto2 = ImpuestoCanario.sacarIgic(publicaciones[i].getPrecioPublico());
                mensajePublicaciones = "El IVA es " + impuesto2 + " y el IGIC es " + impuesto1;
                System.out.println(mensajePublicaciones);
                break;
            }
        }
        if (publicaciones.length > 100) {
            scanner.close();
        }

    }

}
