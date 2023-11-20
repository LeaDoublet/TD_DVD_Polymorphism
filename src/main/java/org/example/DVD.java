package org.example;

public class DVD extends Article{

    private double duree;

    public double getDuree() {
        return duree;
    }

    public DVD(String reference, double prix, String designation, double duree, String realisateur) {
        super(reference, prix, designation);
        this.duree = duree;
        this.realisateur = realisateur;
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

    public DVD(String reference, double prix, String designation) {
        super(reference, prix, designation);
    }
}
