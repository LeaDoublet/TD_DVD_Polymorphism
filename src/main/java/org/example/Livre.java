package org.example;

public class Livre extends Article {

    private String ISBN;
    private String auteur;

    private int nbpage;

    public Livre(String reference, double prix, String designation, String ISBN, String auteur, int nbpage) {
        super(reference, prix, designation);
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.nbpage = nbpage;
    }

    public int getNbpage() {
        return nbpage;
    }

    public void setNbpage(int nbpage) {
        this.nbpage = nbpage;
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

}
