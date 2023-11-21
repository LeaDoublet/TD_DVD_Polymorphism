package org.example;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String reference;
    private double prix;
    private String designation;



    private Personne personne;

    public Article(String reference, double prix, String designation,Personne personne) {
        this.reference = reference;
        this.prix = prix;
        this.designation = designation;
        this.personne=personne;
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
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    public static List<Article> getArticlesByPersonne(List<Article> articles, Personne personne) {
        List<Article> articlesByPerson = new ArrayList<>();

        for (Article article : articles) {
            if (article.getPersonne().equals(personne)) {
                articlesByPerson.add(article);
            }
        }

        return articlesByPerson;
    }
    public String toString() {
        return "Article{" +
                "reference='" + reference + '\'' +
                ", prix=" + prix +
                ", designation='" + designation + '\'' +
                ", personne=" + personne +
                '}';
    }
}
