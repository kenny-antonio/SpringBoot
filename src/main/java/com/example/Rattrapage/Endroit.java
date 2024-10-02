package com.example.Rattrapage;

import java.util.List;

public class Endroit {
    private String identifiant;
    private String nom;
    private Appartement appartement;

    public Endroit(String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.appartement = appartement;
    }


    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static void getnombreAppartement(List<Appartement> appartements){
    }

}
