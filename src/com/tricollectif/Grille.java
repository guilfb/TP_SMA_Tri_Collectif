package com.tricollectif;


public class Grille {

    private Object[][] grille;

    public Grille(int taille) {
        grille = new Object[taille][taille];
        for(int i = 0; i < taille; i++){
            for(int j = 0; j < taille; j++){
                grille[i][j] = null;
            }
        }
    }

    public int getTaille(){
        return grille.length;
    }
}