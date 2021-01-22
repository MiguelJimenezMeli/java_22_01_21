package controller;

public class Main {

    public static void Ejercicio1() {
        CuentaCorriente c1 = new CuentaCorriente();
        CuentaCorriente c2 = new CuentaCorriente(20, 30);
        c1.ingreso(20);
        c2.transferencia(5, c1);
        CuentaCorriente c3 = new CuentaCorriente(c2);
        if(c1.getSaldo() == 25 && c2.getSaldo() == 25 && c3.getSaldo() == 25) {
            System.out.println("Salio todo bien :)");
        }
    }

    public static void Ejercicio2() {
        Contador c1 = new Contador();
        Contador c2 = new Contador(25);
        for(int i = 0; i < 333; i++) {
            c1.incrementar();
        }
        for(int i = 0; i < 10; i++) {
            c1.decrementar();
            c2.decrementar();
        }
        Contador c3 = new Contador(c2);
        c3.incrementar();
        if(c1.getValor() == 323 && c2.getValor() == 15 && c3.getValor() == 16) {
            System.out.println("Salio todo bien :)");
        }

    }

    public static void Ejercicio3() {
        Libro l1 = new Libro();
        System.out.println(l1);
    }

    public static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        Ejercicio3();

    }
}