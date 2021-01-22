package controller;

public class Fraccion {
    private int numerador;
    private int denominador;

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private Fraccion reducir() {
        int d = gcd(getNumerador(), getDenominador());
        return new Fraccion(getNumerador() / d, getDenominador() / d);
    }

    private static Fraccion enteroAFraccion(int n) {
        return (new Fraccion(n, 1)).reducir();
    }

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public Fraccion sumar(Fraccion f2) {
        int nuevoNumeradorF1 = getNumerador() * f2.getDenominador();
        int nuevoNumeradorF2 = f2.getNumerador() * getDenominador();
        int nuevoDenominador = getDenominador() * f2.getDenominador();
        return (new Fraccion(nuevoNumeradorF1 + nuevoNumeradorF2, nuevoDenominador)).reducir();
    }

    public Fraccion sumar(int n) {
        return sumar(enteroAFraccion(n));
    }

    public Fraccion multiplicar(Fraccion f2) {
        int nuevoNumerador = getNumerador() * f2.getNumerador();
        int nuevoDenominador = getDenominador() * f2.getDenominador();
        return (new Fraccion(nuevoNumerador, nuevoDenominador)).reducir();
    }

    public Fraccion multiplicar(int n) {
        return multiplicar(enteroAFraccion(n));
    }

    public Fraccion restar(Fraccion f2) {
        return sumar(f2.multiplicar(-1));
    }

    public Fraccion restar(int n) {
        return restar(enteroAFraccion(n));
    }

    public Fraccion dividir(Fraccion f2) {
        Fraccion inversaF2 = new Fraccion(f2.getDenominador(), f2.getNumerador());
        return multiplicar(inversaF2);
    }

    public Fraccion dividir(int n) {
        return dividir(enteroAFraccion(n));
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return getNumerador() + " / " + getDenominador();
    }
}
