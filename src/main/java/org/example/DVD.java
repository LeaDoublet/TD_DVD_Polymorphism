package org.example;

public class DVD extends Article{

    private double duree;

    public double getDuree() {
        return duree;
    }

    public DVD(String reference, double prix, String designation, double duree, Personne realisateur) {
        super(reference, prix, designation,realisateur);
        this.duree = duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    private String realisateur;

    public DVD(String reference, double prix, String designation, Personne personne) {
        super(reference, prix, designation,personne);
    }
}
