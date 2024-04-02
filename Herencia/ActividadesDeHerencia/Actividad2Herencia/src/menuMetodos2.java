

import java.util.Scanner;

public class menuMetodos2 {

    public static void main(String[] args) {
        int a,b,m,op;
        Scanner entrada=new Scanner(System.in);
        do{ 
          System.out.println("\n    MENU" + 
                "\n 1. MCD entre dos numeros."+
                "\n 2. Determinar si un numero es primo"+
                "\n 3. Hallar el factorial de un numero"+
                "\n 4. Determinar si un número de tres cifras es simétrico"+
                "\n 5. Hallar e imprimir los números múltiplos de 2 y 3 que esten entre dos valores A y B"+
                "\n 6. Hallar la cantidad de cifras que tiene un numero entero: "+
                "\n 7. Hallar el mcm entre dos  numeros: "+  
                "\n 8. Hallar las permutaciones de un conjunto de n elementos, tomando de m elementos: "+ 
                "\n 9. Hallar el mayor número que se pueda formar a partir de las tres cifras de un numero dado: "+ 
                "\n 10. Salir"+
                "\n\nIngrese su opcion: " );
          op=entrada.nextInt();
                    
            switch(op){
                case 1: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();
                        System.out.println("El MCD entre "+a + " y " + b + " es= "+ mcd(a,b));
                        break;
                case 2: System.out.println("\nIngrese el número que desea evaluar si es primo");
                        a=entrada.nextInt();
                        System.out.println(primo(a));
                        break;
                case 3: System.out.println("\nIngrese el número al que le desea hallar el factorial: ");
                        a=entrada.nextInt();  //a = 5  1*2*3*4*5=120
                        int k= factorial(a);  
                        System.out.println("El Factorial de "+a + " es: " + k);
                        a=k+10;
                        break;
                case 4: System.out.println("\nIngrese el número de tres cifras que desea evaluar para saber si es simétrico: ");
                        a=entrada.nextInt();
                        if (simetrico(a))
                            System.out.println("El número "+a + " es simétrico ");
                        else
                            System.out.println("El número "+a + " NO es simétrico ");
                        
                        break;
                case 5: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();
                        multiplos2y3(a,b);
                        break;
                case 6: System.out.println("\nIngrese el numero entero al que le desea contar sus cifras");
                        a=entrada.nextInt();
                        System.out.println("El número "+a + " tiene " + cuentacifras(a) + " cifras");
                        break;
                case 7: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();   
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();  
                        System.out.println("El mcm entre "+a + " y " + b + " es= "+ mcm(a,b));
                        break;
                case 8:System.out.println("\nIngrese el numero de elementos del conjunto");
                        a=entrada.nextInt();
                        System.out.println("Ingrese cuantos elementos quiere permutar");
                        b=entrada.nextInt();
                        System.out.println("El numero de permutaciones es "+ permutaciones(a,b));
                        break;
                    
                case 9: System.out.println("Ingrese numero de tres cifras para hallar el mayor valor con las mismas cifras");
                        a=entrada.nextInt();  // a=385
                        System.out.println("El mayor numero con las mismas tres cifras es: "+ nmayor(a)); // 853
                        break; 
                case 10: System.out.println("Hasta pronto.");
                        break;
                default: System.out.println("Opcion incorrecta.");
                        break;
                                       
            }
            
        }while(op!=10);
        
} 

    // Metodo para determinar si un número es primo o no.
    public static String primo(int a) { // a = 1
        int cont = 0, x;

        for (x = 1; x <= a; x++) {
            if (a % x == 0) { // 1
                cont++; // cont = 1
            }
        }
        if (cont <= 2) {
            return "El numero " + a + " es primo";
        } else
            return "El numero " + a + " NO es primo";
    }

    // Método para determinar si un número es simétrico, se lee igual de izquiera a
    // derecha, que de derecha a izquierda.
    public static boolean simetrico(int a) {
        boolean rta = false;
        int u, c;
        c = a / 100; // cifra de las centenas c=5
        u = a % 10; // cifra de las unidades u= 7
        if (c == u) {
            return true;
        } else
            return false;

    }

    // Método para hallar los múltiplos de 2 y 3 entre A y B
    public static void multiplos2y3(int a, int b) {
        int x;
        for (x = a; x <= b; x++) {
            if (x % 2 == 0 && x % 3 == 0) {
                System.out.println("El numero " + x + " es múltiplo de 2 y 3");
            }

        }

    }

    // Metodo para contar la cantidad de cifras que tiene un número entero
    public static int cuentacifras(int a) {
        int cont = 0, x;
        while (a != 0) {
            a = a / 10;
            cont++;
        }
        return cont;
    }
    // //Método para hallar el mcm entre dos números
    // public static int mcm (int a , int b){ a=15 y b=20
    // int num1, num2,m=0;
    // num1 = Math.max(a, b);
    // num2 = Math.min (a,b);
    // for (int x=num1; x<=(num1*num2); x++){
    // if (x%a==0 && x%b==0){
    // m=x;
    // break;
    // }
    // }
    // return m;
    // }

    // Método para hallar el mcm entre dos números
    public static int mcm(int a, int b) { // a= 15 y b= 20
        // por el metodo de euclides
        int m;
        m = (a * b) / mcd(a, b); // llamada en cadena main ---> mcm ----> mcd
        // m= (300)/ 5 = 60
        return m;
    }

    // METODOA ---> METODOB ----->METODOC

    // main() ---> permutaciones() -----> factorial()
    // Método para hallar las permutaciones
    public static int permutaciones(int a, int b) {
        int p;
        p = factorial(a) / factorial(a - b); // P = a! / (a-b)!
        return p;
    }

    // Método para hallar las permutaciones
    public static int nmayor(int a) { // 385
        int n, u, d, c, mayor, medio, menor, x;
        c = a / 100; // c = 3
        x = a % 100; // x = 85
        d = x / 10; // d = 8
        u = x % 10; // u = 5

        if (c >= d && d >= u) {
            mayor = c;
            medio = d;
            menor = u;
        } else {
            if (c >= u && u >= d) {
                mayor = c;
                medio = u;
                menor = d;
            } else {
                if (d >= c && c >= u) {
                    mayor = d;
                    medio = c;
                    menor = u;
                } else {
                    if (d >= u && u >= c) {
                        mayor = d;
                        medio = u;
                        menor = c;
                    } else {
                        if (u >= c && c >= d) {
                            mayor = u;
                            medio = c;
                            menor = d;
                        } else {
                            mayor = u;
                            medio = d;
                            menor = c;
                        }
                    }
                }
            }
        }
        n = mayor * 100 + medio * 10 + menor * 1; // 8*100 + 5*10 + 3*1
        return n;
    }

    // Metodo para hallar el factorial de un numero entero n!
    public static int factorial(int a) {
        int f = 1, x;
        for (x = 1; x <= a; x++) {
            f = f * x; // La variable f acumula los productos
        }
        return f;
    }

    // Método para hallar el MCD entre dos números
    public static int mcd(int a, int b) { // a= 20 y b=50
        int d = 1, men = a, x;
        if (a > b) {
            men = b;
        }
        for (x = 1; x <= men; x++) {
            if (a % x == 0 && b % x == 0) { // % MOD
                d = x; // d= 1 2 5 10
            }
        }
        return d;
    }

}
