/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author m.perot
 */
public class User {
    
    private int id;
    private String nom;
    private String prenom;
    private String email;

    public User(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    Object getId() {
        return this.id;
    }

    Object getName() {
        return this.nom;
    }

    Object getMail() {
        return this.email;
    }

    Object getPrenom() {
        return this.prenom;
    }
    
}
