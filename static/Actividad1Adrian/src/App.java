import Net.SalesianosSchool.Actividad.primera.SalesianosSchool;
import Net.SalesianosSchool.Actividad.segunda.NumberComparator;

public class App {
    public static void main(String[] args) throws Exception {
        
    /*    System.out.println(SalesianosSchool.GROUP);
       System.out.println(SalesianosSchool.totalSchool);

       SalesianosSchool schoolLaCuesta = new SalesianosSchool(1,"La cuesta");
       SalesianosSchool schoolLaOrotava = new SalesianosSchool(2,"La Orotava");
       SalesianosSchool schoolHogarEscuela = new SalesianosSchool(3,"hogar escuela");

       System.out.println(SalesianosSchool.totalSchool); */

        System.out.println("entre 14 y 47 el mayor es " + NumberComparator.getBigger(14, 47));
        
        System.out.println("Los numeros 5 y 6 son distintos " + !NumberComparator.areEquals(5,6)+ " pero 77 son " + NumberComparator.areEquals(7, 7));

        int Array[] = {12, 8, 45, -13, 67, 21, 190 };
        System.out.println("El numero mas pequeño del array es " + NumberComparator.getMinimum(Array));

        
       
       
    }
}
