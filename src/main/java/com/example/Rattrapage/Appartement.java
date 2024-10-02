package com.example.Rattrapage;

public class Appartement {
    private String id;
    private String titre;
    private String description;
    private String loyerMensuel;
    private Status status;
    private Endroit endroit;

    public Appartement(String id, String titre, String description, String loyerMensuel, Status status, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.status = status;
        this.endroit = endroit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoyerMensuel() {
        return loyerMensuel;
    }

    public void setLoyerMensuel(String loyerMensuel) {
        this.loyerMensuel = loyerMensuel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
