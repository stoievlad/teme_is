package meow.apppp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Companie companie = new Companie();
        List<Departament> departamente = new ArrayList<>();
        departamente.add(new Departament("HR"));
        departamente.add(new Departament("IT&C"));
        List<Birou> birouri_dept_1 = new ArrayList<>();
        List<Birou> birouri_dept_2 = new ArrayList<>();
        birouri_dept_1.add(new Birou(0));
        birouri_dept_1.add(new Birou(1));
        birouri_dept_1.add(new Birou(2));
        birouri_dept_1.add(new Birou(3));
        birouri_dept_1.add(new Birou(4));
        birouri_dept_2.add(new Birou(5));
        birouri_dept_2.add(new Birou(6));
        birouri_dept_2.add(new Birou(7));
        birouri_dept_2.add(new Birou(8));
        departamente.get(0).setBirouri(birouri_dept_1);
        departamente.get(1).setBirouri(birouri_dept_2);
        List<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat("John"));
        angajati.add(new Angajat("Ion"));
        angajati.add(new Angajat("George"));
        angajati.add(new Angajat("Alina"));
        angajati.add(new Angajat("Alexandru"));
        angajati.add(new Angajat("Andrei"));
        angajati.add(new Angajat("Cristian"));
        angajati.add(new Angajat("Mihai"));
        angajati.add(new Angajat("Gheorghe"));
        departamente.get(0).setManager(angajati.get(0));
        departamente.get(1).setManager(angajati.get(1));
        companie.setAngajati(angajati);
        companie.setDepartamente(departamente);

        System.out.println(companie);
    }
}