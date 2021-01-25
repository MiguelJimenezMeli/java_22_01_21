package controller;

import java.util.Scanner;

public class Main {

    public static void Ejercicio1() {
        System.out.println("Creando cuenta corrite 1 sin parametros");
        CuentaCorriente c1 = new CuentaCorriente();
        System.out.println("Creando cuenta corrite 2 con parametros");
        CuentaCorriente c2 = new CuentaCorriente(20, 30);
        System.out.println("Ingresando $20 a cuenta corrite 1");
        c1.ingreso(20);
        System.out.println("Transfiriendo $5 de cuenta corrite 2 a cuenta corrite 1");
        c2.transferencia(5, c1);
        System.out.println("Copiando cuenta corrite 2 a cuenta corrite 3");
        CuentaCorriente c3 = new CuentaCorriente(c2);
        if(c1.getSaldo() == 25 && c2.getSaldo() == 25 && c3.getSaldo() == 25) {
            System.out.println("Salio todo bien :)");
        }
    }

    public static void Ejercicio2() {
        System.out.println("Creando contador 1 sin parametros");
        Contador c1 = new Contador();
        System.out.println("Creando contador 2 con parametros");
        Contador c2 = new Contador(25);
        System.out.println("Modificando contadores");
        for(int i = 0; i < 333; i++) {
            c1.incrementar();
        }
        for(int i = 0; i < 10; i++) {
            c1.decrementar();
            c2.decrementar();
        }
        System.out.println("Copiando contador 2 a contador 3");
        Contador c3 = new Contador(c2);
        System.out.println("Modificaondo contador 3");
        c3.incrementar();
        if(c1.getValor() == 323 && c2.getValor() == 15 && c3.getValor() == 16) {
            System.out.println("Salio todo bien :)");
        }

    }

    public static void Ejercicio3() {
        Libro l1 = new Libro();
        System.out.println(l1);
    }

    public static void Ejercicio4() {
        System.out.println("Creando fracciones");
        Fraccion f1 = new Fraccion(3, 4);
        Fraccion f2 = new Fraccion(2, 7);
        System.out.println("Sumando fracciones");
        Fraccion suma = f1.sumar(f2);
        System.out.println("Restando fracciones");
        Fraccion resta = f1.restar(f2);
        System.out.println("Multiplicando fracciones");
        Fraccion prod = f1.multiplicar(f2);
        System.out.println("Dividiendo fracciones");
        Fraccion div = f1.dividir(f2);
        System.out.println("Sumando fraccion con entero");
        Fraccion sumaEntero = f1.sumar(8);
        System.out.println("Resultados:");
        System.out.printf("Suma :");
        System.out.println(suma);
        System.out.printf("Resta :");
        System.out.println(resta);
        System.out.printf("Multiplicacion :");
        System.out.println(prod);
        System.out.printf("Division :");
        System.out.println(div);
        System.out.printf("Suma de entero :");
        System.out.println(sumaEntero);
    }

    public static void Ejercicio5() {
        System.out.println("Creando Fecha");
        Fecha date = new Fecha(2021,0,30, 18);
        System.out.println("Año: " + date.getYear());
        System.out.println("Mes: " + date.getMonth());
        System.out.println("Dia: " + date.getDay());
        System.out.println("Hora: " + date.getHour());
        System.out.println("Minuto: " + date.getMinute());
        System.out.println("Segundo: " + date.getSecond());
        System.out.println("La fecha es: " + date);
        System.out.println("Es correcta: " + date.check());
        System.out.println("Se suma 2 dias");
        for (int i = 0; i<2; i++){date.addDay();}
        System.out.println("La fecha es: " + date);
        System.out.println("Se resta 1 dias");
        date.dedDay();
        System.out.println("La fecha es: " + date);
    }

    public static void Ejercicio6() {
        String test = "  hola mundo   ";
        System.out.println("Test: " + test);
        System.out.println("Agregando 3 '#' a la derecha: " + StringUtil.rpad(test, '#', 3));
        System.out.println("Agregando 3 '#' a la izquierda: " + StringUtil.lpad(test, '#', 3));
        System.out.println("Quitando espacios de la izquierda: " + StringUtil.ltrim(test));
        System.out.println("Quitando espacios de la derecha: " + StringUtil.rtrim(test));
        System.out.println("Quitando espacios de izquierda y derecha: " + StringUtil.trim(test));
        System.out.println("Encontrando la 2 aparicion de 'o': " + StringUtil.indexOfN(test,'o', 2));
    }

    public static void main(String[] args) {
        int key = 9;
        Scanner scanner = new Scanner(System.in);
        while (key != 0)
        {
            System.out.println("Hola, dime que ejercicio quieres ver [1,2,3,4,5,6] o [0] para salir");
            try { key = scanner.nextInt();}
            catch (Exception ex)
            {
                key = 9;
                scanner.next();
            }
            if (key == 1){Ejercicio1();}
            else if (key == 2) {Ejercicio2();}
            else if (key == 3) {Ejercicio3();}
            else if (key == 4) {Ejercicio4();}
            else if (key == 5) {Ejercicio5();}
            else if (key == 6) {Ejercicio6();}
        }
        System.out.printf("Adios");
    }
}
