package com.example;

import java.util.ArrayList;
import java.util.List;

public class Carte {
    class Parte extends Identificator {

        class Capitol extends Identificator {

            class Sectiune extends Identificator {
                private Sectiune(String titlu, int numar) {
                    super.titlu = titlu;
                    super.numar = numar;
                }

            }

            String rezumat;
            List<Sectiune> sectiuni = new ArrayList<Sectiune>();

            private Capitol(String titlu, int numar, String rezumat) {
                this.rezumat = rezumat;
                super.titlu = titlu;
                super.numar = numar;
            }

            String getRezumat() {
                return rezumat;
            }

            void setRezumat(String rezumat) {

                this.rezumat = rezumat;
            }

            List<Sectiune> getSectiuni() {
                return sectiuni;
            }

            void addSectiune(String titlu, int numar) {
                sectiuni.add(new Sectiune(titlu, numar));
            }

        }

        List<Capitol> capitole = new ArrayList<>();

        private Parte(String titlu, int numar) {
            super.numar = numar;
            super.titlu = titlu;
        }

        List<Capitol> getCapitole() {
            return capitole;
        }

        void addCapitol(String titlu, int numar, String rezumat) {
            capitole.add(new Capitol(titlu, numar, rezumat));
        }

    }

    private String editor;
    private String data_publicare;
    private String ISBN;
    private List<Parte> parti = new ArrayList<>();

    public Carte(String editor, String data_publicare, String ISBN) {
        this.editor = editor;
        this.data_publicare = data_publicare;
        this.ISBN = ISBN;

    }

    public void addParte(String titlu, int numar) {
        parti.add(new Parte(titlu, numar));
    }

    public List<Parte> getParti() {
        return parti;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setDataPublicare(String data_publicare) {
        this.data_publicare = data_publicare;
    }

    public String getDataPublicare() {
        return data_publicare;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    

}
