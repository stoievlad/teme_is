package meow.apppp;

public class Birou {
    private int numar;
    private Departament departament;
    bool is_sediu_central = false;

    public bool getIs_sediu_central() {
        return is_sediu_central;
    }

    public void setIs_sediu_central(bool is_sediu_central) {
        this.is_sediu_central = is_sediu_central;
    }

    public Birou(int numar) {
        this.numar = numar;

    }

    public Birou(int numar, Departament departament, bool is_sediu_central) {
        this.departament = departament;
        this.numar = numar;
        this.is_sediu_central = is_sediu_central;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return String.valueOf(numar);
    }

}
