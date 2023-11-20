package org.example;

public class Livre extends Article {

    private String ISBN;
    private String auteur;

    public Livre(String reference, double prix, String designation, String ISBN, String auteur) {
        super(reference, prix, designation);
        this.ISBN = ISBN;
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Livre(String reference, double prix, String designation) {
        super(reference, prix, designation);
    }
}
