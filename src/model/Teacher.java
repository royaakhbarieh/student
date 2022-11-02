/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author royaa
 */
public class Teacher {
    // 3 Attributes
    private String nom;
    private String prenom;
    private int anciennete;
    
    // Constructeurs creer instence on peut manipuler la class

    public Teacher() {
    }

    public Teacher(String nom, String prenom, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }
    
    
    
    //Methodes getters and setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }
    
    
}
