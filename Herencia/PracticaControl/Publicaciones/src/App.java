import net.editorialsalesiana.libreria.publicaciones.LibroTexto;
import net.editorialsalesiana.libreria.publicaciones.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String[] temas = {"Tema 1", "Tema 2", "Tema 3"}; 
        LibroTexto librito = new LibroTexto("Como ser feliz", 400, "nuasdll", 22f, 0, "asd", "matematicas", temas);
        librito.toString();

        String primerTema = "hola"; 
        temas[0] = primerTema;
        
        librito.setTemasArray(new String[]{"nuevoTema1", "nuevoTema2"});
        
        String [] nombresArticulos = {"hola ","hola"};
        Revista revistona = new Revista("happy nation", 22, "22-323", 20, 50, "25/24", 01, nombresArticulos
        );

        revistona.toString();
    
    }
}
