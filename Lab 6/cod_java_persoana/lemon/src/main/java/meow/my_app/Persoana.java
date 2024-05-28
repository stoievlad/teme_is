package meow.my_app;

import java.util.ArrayList;
import java.util.List;

public class Persoana {
    private String nume;
    private List<Persoana> parinti;
    private List<Persoana> copii;

    public Persoana(String nume) {
        this.nume = nume;
        this.parinti = new ArrayList<>();
        this.copii = new ArrayList<>();
    }

    public List<Persoana> getParinti() {
        return parinti;
    }

    public void adaugaParinte(Persoana persoana) {
        if (this != persoana) {

            if (parinti.size() <= 1) {
                parinti.add(persoana);
            } else {
                System.out.println("Persoana are deja 2 parinti");
            }
        } else {
            System.out.println("Nu poti fi propriul parinte");
        }
    }

    public void setParinti(Persoana persoana1, Persoana persoana2) {
        if (persoana1 != this && persoana2 != this && persoana1 != persoana2) {
            parinti = new ArrayList<>();
            parinti.add(persoana1);
            parinti.add(persoana2);
            persoana1.copii.add(this);
            persoana2.copii.add(this);
        }
    }

    public List<Persoana> getCopii() {
        return copii;
    }

    public void adaugaCopil(Persoana copil) {

        if (copil != this) {
            if (copil != parinti.get(0) && copil != parinti.get(1)) {
                this.copii.add(copil);
                copil.adaugaParinte(this);
            } else {
                System.out.println("Parintii nu pot sa iti fie copii");
            }
        } else {
            System.out.println("Nu poti sa fi propriul copil");
        }
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("Nume: " + nume + "\n");
        if (parinti.size() == 2) {
            str.append("Parinte 1: " + parinti.get(0).nume + "\n" + "Parinte 2: " + parinti.get(1).nume + "\n");
        }
        if (copii.size() != 0) {
            str.append("Copii: \n");
            for (Persoana copil : copii) {
                str.append("     " + copil.nume + "\n");
            }
        }
        return str.toString();
    }

}
