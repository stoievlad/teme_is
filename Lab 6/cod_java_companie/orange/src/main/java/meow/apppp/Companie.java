package meow.apppp;

import java.util.List;

public class Companie {
    private List<Departament> departamente;
    private List<Angajat> angajati;

    public Companie() {

    }

    public Companie(List<Departament> departamente) {
        this.departamente = departamente;
    }

    public void setDepartamente(List<Departament> departamente) {
        this.departamente = departamente;
    }

    public List<Departament> getDepartamente() {
        return departamente;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }


    public List<Angajat> getAngajati() {
        return angajati;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Departamente: \n");
        for (Departament d : departamente) {
            str.append("     " + d + "\n");
        }
        str.append("\nAngajati: \n");
        for (Angajat a : angajati) {
            str.append("     " + a + "\n");
        }
        return str.toString();

    }
}
