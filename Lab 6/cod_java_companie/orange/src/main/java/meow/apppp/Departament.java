package meow.apppp;

import java.util.List;

public class Departament {

    private String nume;
    private List<Birou> birouri;
    private Angajat manager;

    public Departament(String nume) {
        this.nume = nume;
    }

    public Departament(String nume, List<Birou> birouri) {
        this.nume = nume;
        this.birouri = birouri;
    }

    public List<Birou> getBirouri() {
        return birouri;
    }

    public String getNume() {
        return nume;
    }

    public void setManager(Angajat angajat) {
        this.manager = angajat;
    }

    public Angajat getManager() {
        return manager;
    }

    public void setBirouri(List<Birou> birouri) {
        this.birouri = birouri;
        for (Birou b : this.birouri) {
            b.setDepartament(this);
        }
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nume: " + nume + "\n");
        str.append("     Manager: " + manager.getNume() + "\n");
        str.append("     Birouri: \n");
        for (Birou b : birouri) {
            str.append("              " + b + "\n");
        }
        return str.toString();
    }

}
