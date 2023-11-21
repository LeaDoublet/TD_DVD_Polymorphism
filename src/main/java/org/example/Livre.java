package org.example;

public class Livre extends Article {

    private String ISBN;

    private int nbpage;



    public Livre(String reference, double prix, String designation, String ISBN, Personne personne, int nbpage) {
        super(reference, prix, designation,personne);
        this.ISBN = ISBN;
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



}
