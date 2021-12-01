package com.funsoft.feignrestclient.model;

import java.io.Serializable;

public class Product implements Serializable {

    public long id;
    public String libelle;
    public String categorie;

    public Product(long id, String libelle, String categorie) {
        this.id = id;
        this.libelle = libelle;
        this.categorie = categorie;
    }

    public Product(){ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
