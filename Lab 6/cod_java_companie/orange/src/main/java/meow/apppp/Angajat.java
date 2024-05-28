package meow.apppp;

public class Angajat {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }

    public Angajat(String nume) {
        this.nume = nume;
    }
}
