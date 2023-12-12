package fr.dampierre;

import java.util.Random;

public class App {
    
    public static int lancerDeDés(Random generateur, int plateau, int numLancer) {

            int lancer = generateur.nextInt(6) + 1;
            plateau = plateau + lancer;
        
            System.out.println(String.format("Lancer %d : vous avez fait %d . Vous êtes sur la case %d", numLancer, lancer, plateau));
            return plateau;
    }

    public static int jouerUnePartie(Random generateur, int plateau, int nblancer) {
        for (int i = 1; i <= nblancer; i++) {
            plateau = lancerDeDés(generateur, plateau, i);
        }
        return plateau;
    }

    public static void afficherResultatPartie(int plateau, int jeu) {
        if (plateau == jeu) {
            System.out.println("Vous avez gagné");
        } else {
            System.out.println("Vous avez perdu");
        }
    }

    public static void main(String[] args) {
        Random generateur = new Random();
        int plateau = 0;
        int nblancer = 5;
        int jeu = 20;

        System.out.println("Bienvenue ! Commençons...");

        plateau = jouerUnePartie(generateur, plateau, nblancer);

        afficherResultatPartie(plateau, jeu);
    }

}