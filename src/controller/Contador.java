package controller;

public class Contador {

    private int valor;

    public Contador() {
        setValor(0);
    }

    public Contador(int valorInicial) {
        setValor(valorInicial);
    }

    public Contador(Contador otro) {
        setValor(otro.getValor());
    }

    public void incrementar() {
        setValor(getValor() + 1);
    }

    public void decrementar() {
        setValor(getValor() - 1);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }
}
