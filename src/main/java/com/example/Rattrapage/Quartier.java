package com.example.Rattrapage;

import java.util.List;

public class Quartier extends Endroit{
    private List<Immeuble> ensembleImmeuble;

    public Quartier(String identifiant, String nom, List<Immeuble> ensembleImmeuble) {
        super(identifiant, nom);
        this.ensembleImmeuble = ensembleImmeuble;
    }

    public static void getAppartement (List<Appartement> appartement){
    }
}
