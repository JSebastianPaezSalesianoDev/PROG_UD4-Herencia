import net.Calculadora.Areas.Circulo;
import net.Calculadora.Areas.Rectangulo;
import net.Calculadora.Areas.TrianguloRectangulo;
import net.Calculadora.Basica.CalculadoraAreas;
import net.Calculadora.Basica.CalculadoraPerimetros;
public class Actividad2 {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(2, 4);
        
        Circulo circulo = new Circulo(3.33f);

        TrianguloRectangulo triangulo = new TrianguloRectangulo(2, 3);

        CalculadoraAreas.calcularArea(triangulo);
        CalculadoraPerimetros.calcularPerimetro(circulo);
        CalculadoraPerimetros.calcularPerimetro(rectangulo);   


        // FORMA CORRECTA
        System.out.println(CalculadoraPerimetros.calcularPerimetro(triangulo));
        
    }
}
