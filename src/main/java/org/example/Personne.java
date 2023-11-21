package org.example;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Personne {
    private String nom;
    private String prenom;
    private Date dateNaissance;


    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    @Override
    public String toString() {

        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance.affichage() +
                '}';
    }

}
