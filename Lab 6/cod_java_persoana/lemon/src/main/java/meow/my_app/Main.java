package meow.my_app;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("George");
        Persoana persoana2 = new Persoana("Ilena");
        Persoana persoana3 = new Persoana("Ionel");
        Persoana persoana4 = new Persoana("Newton");
        persoana3.setParinti(persoana1, persoana2);
        persoana3.adaugaCopil(persoana4);

        System.out.println(persoana1);
        System.out.println();
        System.out.println(persoana2);
        System.out.println();
        System.out.println(persoana3);
        System.out.println();
        System.out.println(persoana4);

    }
}