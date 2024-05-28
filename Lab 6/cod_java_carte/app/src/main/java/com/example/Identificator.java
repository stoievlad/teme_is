package com.example;

public abstract class Identificator {
    protected String titlu;
    protected int numar;

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {

        return "Titlu: " + titlu + "\n" + "Numar: " + numar + "\n";
    }
}
