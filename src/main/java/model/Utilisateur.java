/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jb.loirot
 */
public class Utilisateur {

    private int ID;
    private String NOM;
    private String PRENOM;
    private String ADRESSE_MAIL;
    private String IDENTIFIANT;
    private int MOT_DE_PASSE;

//Constructor without ID_Utilisateur
    public Utilisateur(String NOM, String PRENOM, String ADRESSE_MAIL, String IDENTIFIANT, int MOT_DE_PASSE) {
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.ADRESSE_MAIL = ADRESSE_MAIL;
        this.IDENTIFIANT = IDENTIFIANT;
        this.MOT_DE_PASSE = MOT_DE_PASSE;
    }

//Constructor with all attributs
    public Utilisateur(int ID, String NOM, String PRENOM, String ADRESSE_MAIL, String IDENTIFIANT, int MOT_DE_PASSE) {
        this.ID = ID;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.ADRESSE_MAIL = ADRESSE_MAIL;
        this.IDENTIFIANT = IDENTIFIANT;
        this.MOT_DE_PASSE = MOT_DE_PASSE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public String getADRESSE_MAIL() {
        return ADRESSE_MAIL;
    }

    public void setADRESSE_MAIL(String ADRESSE_MAIL) {
        this.ADRESSE_MAIL = ADRESSE_MAIL;
    }

    public String getIDENTIFIANT() {
        return IDENTIFIANT;
    }

    public void setIDENTIFIANT(String IDENTIFIANT) {
        this.IDENTIFIANT = IDENTIFIANT;
    }

    public int getMOT_DE_PASSE() {
        return MOT_DE_PASSE;
    }

    public void setMOT_DE_PASSE(int MOT_DE_PASSE) {
        this.MOT_DE_PASSE = MOT_DE_PASSE;
    }
}
