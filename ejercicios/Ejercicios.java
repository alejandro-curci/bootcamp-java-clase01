package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ejercicio 1: mostrar n pares
        System.out.println("EJERCICIO 1");
        System.out.println("Cuantos numeros pares desea mostrar?");
        int pares = sc.nextInt();
        mostrarPares(pares);
        System.out.println();

        // ejercicio 2: mostrar n multiplos de m
        System.out.println("EJERCICIO 2");
        System.out.println("Que multiplos desea mostrar?");
        int m = sc.nextInt();
        System.out.println("Cuantos multiplos desea mostrar?");
        int n = sc.nextInt();
        mostrarMultiplos(m, n);
        System.out.println();

        // ejercicio 3: determinar si un numero es primo
        System.out.println("EJERCICIO 3");
        System.out.println("Ingrese el numero a validar si es primo");
        int p = sc.nextInt();
        System.out.println(esPrimo(p));
        System.out.println();

        // ejercicio 4: mostrar los n primos
        System.out.println("EJERCICIO 4");
        System.out.println("Cuantos numeros primos desea mostrar?");
        int primos = sc.nextInt();
        mostrarPrimos(primos);
        System.out.println();

        // ejercicio 5: mostrar los primeros n numeros que tengan m digitos d
        System.out.println("EJERCICIO 5");
        System.out.println("Ingrese la cantidad de numeros");
        int cant = sc.nextInt();
        System.out.println("Ingrese el digito buscado");
        int digito = sc.nextInt();
        System.out.println("Ingrese cuantos digitos busca en cada numero");
        int cantDigitos = sc.nextInt();
        mostrarSegunDigito(cant, cantDigitos, digito);
    }

    public static void mostrarPares(int n) {
        for(int i=0; i<n; i++) {
            System.out.println("Par "+(i+1)+":  "+((i+1)*2));
        }
    }

    public static void mostrarMultiplos(int m, int n) {
        for(int i=0; i<n; i++) {
            System.out.println("Múltiplo "+(i+1)+" de "+m+":  "+((i+1)*m));
        }
    }

    public static boolean esPrimo(int n) {
        boolean solution = true;
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                solution = false;
            }
        }
        return solution;
    }

    public static void mostrarPrimos(int n) {
        List<Integer> numerosPrimos = new ArrayList<>();
        int num = 2;
        while(numerosPrimos.size()<n) {
            if(esPrimo(num)) {
                numerosPrimos.add(num);
            }
            num++;
        }
        System.out.println("Los primeros "+n+" numeros primos son: ");
        for(int k : numerosPrimos) {
            System.out.print(k+"  ");
        }
        System.out.println("");
    }

    public static boolean tieneDigito(int numero, int cantidad, int digito) {
        List<Integer> digitos = new ArrayList<>();
        while(numero>0) {
            digitos.add(numero%10);
            numero /= 10;
        }
        int contador = 0;
        for(int d : digitos) {
            if(d==digito) {
                contador++;
            }
        }
        return contador >= cantidad;
    }

    public static void mostrarSegunDigito(int n, int cantidad, int digito) {
        List<Integer> numeros = new ArrayList<>();
        int num = 1;
        while(numeros.size()<n) {
            if(tieneDigito(num, cantidad, digito)) {
                numeros.add(num);
            }
            num++;
        }
        System.out.println("Los primeros "+n+" numeros con "+cantidad+" digitos "+digito+" son: ");
        for(int k : numeros) {
            System.out.print(k+"  ");
        }
        System.out.println("");
    }

}
