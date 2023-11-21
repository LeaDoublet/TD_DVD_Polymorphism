package org.example;

public class Main {
    public static void main(String[] args){

        Date d1 = new Date(12,10,1976);
        Personne auteur = new Personne("Jules","Verne",d1);
    Article article1 = new Article("A001", 29.99, "Article 1", auteur);
    Article article2 = new Article("A002", 49.99, "Article 2",auteur);
    Livre livre1 = new Livre("L001", 19.99, "Livre 1", "978-3-16-148410-0", auteur,25);
    DVD dvd1 = new DVD("D001", 29.99, "DVD 1", 120.0, auteur);

    // Affichage Articles
        System.out.println("Article 1:");
        afficherDetailsArticle(article1);

    System.out.println("\nArticle 2:");
    afficherDetailsArticle(article2);

    // Modification des infos d'un article
        article1.setPrix(39.99);
        article2.setDesignation("Nouvel designation");

    // Affichage des informations mises à jour
        System.out.println("\nArticle 1 après mise à jour du prix:");
        afficherDetailsArticle(article1);

        System.out.println("\nArticle 2 après mise à jour de la désignation:");
        afficherDetailsArticle(article2);

        System.out.println("Livre 1:");
        afficherDetailsArticle(livre1);

        // Affichage des informations des DVD
        System.out.println("\nDVD 1:");
        afficherDetailsArticle(dvd1);

        // Modification des informations d'un Livre et d'un DVD
        livre1.setPrix(29.99);
        dvd1.setDesignation("Nouveau DVD");

        // Affichage des informations mises à jour
        System.out.println("\nLivre 1 après mise à jour du prix:");
        afficherDetailsArticle(livre1);

        System.out.println("\nDVD 1 après mise à jour de la désignation:");
        afficherDetailsArticle(dvd1);
    }




    private static void afficherDetailsArticle(Article article) {
        System.out.println("Référence: " + article.getReference());
        System.out.println("Prix: " + article.getPrix());
        System.out.println("Désignation: " + article.getDesignation());

        if (article instanceof Livre) {
            Livre livre = (Livre) article;
            System.out.println("ISBN: " + livre.getISBN());
            System.out.println("Auteur: " + livre.getPersonne().toString());
            System.out.println("Nombre de page : "+livre.getNbpage());
        } else if (article instanceof DVD) {
            DVD dvd = (DVD) article;
            System.out.println("Durée: " + dvd.getDuree() + " minutes");
            System.out.println("Réalisateur: " + dvd.getRealisateur());
        }

    }
}