package org.example;

public class Main {
    public static void main(String[] args){
    // Création d'objets Article pour les tests
    Article article1 = new Article("A001", 29.99, "Article 1");
    Article article2 = new Article("A002", 49.99, "Article 2");

    // Affichage des informations des articles
        System.out.println("Article 1:");
    afficherDetailsArticle(article1);

        System.out.println("\nArticle 2:");
    afficherDetailsArticle(article2);

    // Modification des informations d'un article
        article1.setPrix(39.99);
        article2.setDesignation("Nouvel article");

    // Affichage des informations mises à jour
        System.out.println("\nArticle 1 après mise à jour du prix:");
    afficherDetailsArticle(article1);

        System.out.println("\nArticle 2 après mise à jour de la désignation:");
    afficherDetailsArticle(article2);
    }



// Méthode pour afficher les détails d'un article
    private static void afficherDetailsArticle(Article article) {
        System.out.println("Référence: " + article.getReference());
        System.out.println("Prix: " + article.getPrix());
        System.out.println("Désignation: " + article.getDesignation());
    }
}