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
        this.TELEPHONE = TELEPHONE;
        this.ADRESSE = ADRESSE;
        this.CODE_POSTAL = CODE_POSTAL;
        this.VILLE = VILLE;
    }

//Constructor with all attributs
    public Client(int ID_CLIENT, int RAISON_SOCIAL, String NOM, String PRENOM, String EMAIL, int TELEPHONE, String ADRESSE, int CODE_POSTAL, String VILLER) {
        this.ID_CLIENT = ID_CLIENT;
        this.RAISON_SOCIAL = RAISON_SOCIAL;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.EMAIL = EMAIL;
        this.TELEPHONE = TELEPHONE;
        this.ADRESSE = ADRESSE;
        this.CODE_POSTAL = CODE_POSTAL;
        this.VILLE = VILLE;
    }

    public int getID_CLIENT() {
        return ID_CLIENT;
    }

    public void setID_CLIENT(int ID_CLIENT) {
        this.ID_CLIENT = ID_CLIENT;
    }

    public int getRAISON_SOCIAL() {
        return RAISON_SOCIAL;
    }

    public void setRAISON_SOCIAL(int RAISON_SOCIAL) {
        this.RAISON_SOCIAL = RAISON_SOCIAL;
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

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(int TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(String ADRESSE) {
        this.ADRESSE = ADRESSE;
    }

    public int getCODE_POSTAL() {
        return CODE_POSTAL;
    }

    public void setCODE_POSTAL(int CODE_POSTAL) {
        this.CODE_POSTAL = CODE_POSTAL;
    }

    public String getVILLE() {
        return VILLE;
    }

    public void setVILLE(String VILLE) {
        this.VILLE = VILLE;
    }
}

}
