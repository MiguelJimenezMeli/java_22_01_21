package controller;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public Fraccion sumar(Fraccion f1, Fraccion f2) {
        int nuevoNumeradorF1 = f1.getNumerador() * f2.getDenominador();
        int nuevoNumeradorF2 = f2.getNumerador() * f1.getDenominador();
        int nuevoDenominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(nuevoNumeradorF1 + nuevoNumeradorF2, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.getNumerador() * f2.getNumerador();
        int nuevoDenominador = f1.getDenominador() * f2.getNumerador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion f1, Fraccion f2) {
        int nuevoNumeradorF1 = f1.getNumerador() * f2.getDenominador();
        int nuevoNumeradorF2 = f2.getNumerador() * f1.getDenominador();
        int nuevoDenominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(nuevoNumeradorF1 + nuevoNumeradorF2, nuevoDenominador);
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
}
