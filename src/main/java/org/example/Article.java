package org.example;

public class Article {
    private String reference;
    private double prix;
    private String designation;

    public Article(String reference, double prix, String designation) {
        this.reference = reference;
        this.prix = prix;
        this.designation = designation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
