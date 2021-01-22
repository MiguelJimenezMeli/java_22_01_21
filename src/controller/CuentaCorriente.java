package controller;

public class CuentaCorriente {
    private int saldo;
    private int numeroCuenta;
    private static int proxNumeroDeCuenta = 1;

    public CuentaCorriente() {
        setSaldo(0);
        setNumeroCuenta(proxNumeroDeCuenta);
        proxNumeroDeCuenta++;
    }

    public CuentaCorriente(int numeroCuenta, int saldo) {
        if(numeroCuenta < proxNumeroDeCuenta) {
            throw new RuntimeException("El numero de cuenta ya existe.");
        }
        setSaldo(saldo);
        setNumeroCuenta(numeroCuenta);
        proxNumeroDeCuenta = numeroCuenta + 1;
    }

    public CuentaCorriente(CuentaCorriente otra) {
        setSaldo(otra.getSaldo());
        setNumeroCuenta(otra.getNumeroCuenta());
    }

    public int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingreso(int dinero) {
        if(dinero < 0) {
            throw new RuntimeException("El ingreso debe ser positivo!");
        }
        setSaldo(getSaldo() + dinero);
    }

    public void egreso(int dinero) {
        if(dinero < 0 || dinero > getSaldo()) {
            throw new RuntimeException("El egreso debe ser positivo!");
        }
        setSaldo(getSaldo() - dinero);
    }

    public void reintegro(int dinero) {
        ingreso(dinero);
    }

    public void transferencia(int dinero, CuentaCorriente destino) {
        egreso(dinero);
        destino.ingreso(dinero);
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    private void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
