package controller;

public class Libro {
    private String titulo;
    private int ISBN;
    private String autor;
    private int nextISBN = 1;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        setAutor(autor);
        setISBN(nextISBN);
        nextISBN++;
        setPrestado(false);
    }

    public Libro() {
        setTitulo("Programacion en Java");
        setISBN(nextISBN);
        nextISBN++;
        setAutor("Miguel Mateos");
        setPrestado(false);
    }

    public void prestar() {
        if(isPrestado()) {
            throw new RuntimeException("El libro ya esta prestado!");
        }
        setPrestado(true);
    }

    public void devolucion() {
        if(!isPrestado()) {
            throw new RuntimeException("El libro no estaba prestado!");
        }
        setPrestado(false);
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    private void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    private void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return getTitulo() + "," + getISBN() + "," + getAutor() + ".";
    }
}
