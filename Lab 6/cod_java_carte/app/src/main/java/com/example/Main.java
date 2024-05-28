package com.example;


public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte("John", "10.10.2003", "322223452");
        carte.addParte("Partea 1", 1);
        carte.getParti().get(0).addCapitol("Capitol 1", 1, "Rezumat rezumat rezumat");
        carte.getParti().get(0).getCapitole().get(0).addSectiune("Sectiune 1", 1);
        System.out.println(carte.getParti());
        System.out.println();
        carte = null;
        System.gc();
        System.out.println(carte);
    }
}
