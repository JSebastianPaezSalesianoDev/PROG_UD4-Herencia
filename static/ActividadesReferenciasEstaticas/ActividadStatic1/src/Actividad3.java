import java.util.Scanner;

import net.Calculadora.Basica.CalculadoraAvanzada;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("Para ingresar a la calculadora avanzada ingrese -1");
        String opcionUsuario = sc.nextLine();
        if (opcionUsuario.equalsIgnoreCase("-1")) {

            while (seguir) {
                System.out.println("""
                        Escoja su opcion \n1.Mostrar tabla de multiplicar de un numero\n
                        2.Calcular el factorial de un numero\n
                        3.Comprobar si un numero es par\n
                        4.Ver ultima operacion\n
                        5.Cerrar Calculadora"
                            """);
                String opcionUsuarioMenu = sc.nextLine();
                switch (opcionUsuarioMenu) {
                    case "1":
                        System.out.println("Ingrese el numero que desea ver su tabla");
                        int opcionMenuUno = sc.nextInt();
                        sc.nextLine();
                        CalculadoraAvanzada.MultiplicarHastaDiez(opcionMenuUno);
                        break;
                    case "2":
                        System.out.println("Ingrese un numero para ver su factoral");
                        int opcionMenuDos = sc.nextInt();
                        sc.nextLine();
                        CalculadoraAvanzada.calcularFactorial(opcionMenuDos);
                        break;

                    case "3":
                        System.out.println("Ingrese un numero para saber si es par");
                        int opcionMenuTres = sc.nextInt();
                        sc.nextLine();
                        CalculadoraAvanzada.esPar(opcionMenuTres);
                        break;

                    case "4":
                        CalculadoraAvanzada.showUltimaSalida(); //el reto se puede hacer con un array//
                        break;

                    case "5":
                        System.exit(0);
                    default:
                        break;
                }
            }
        } else {
            System.out.println("No ha ingresado una opcion valida.");
        }
        sc.close();
    }
}
