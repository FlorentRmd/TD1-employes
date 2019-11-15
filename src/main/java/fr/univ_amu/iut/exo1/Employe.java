package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {

    static int indexEmp = 0;

    private int Nemploye;
    private int Nsecurite;
    private String Nom;
    private String Prenom;
    private int Echelon;
    private LocalDate DateNaissance;
    private LocalDate DateEmbauche;

    private double base;
    private double nbHeures;

    private double salaireBrut;
    private double salaireNet;

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public Employe(int Nsecurite, String Nom, String Prenom, int Echelon ,LocalDate DateN, LocalDate DateE, double base, double nbHeures){
        this.Nemploye = ++indexEmp;
        this.Nsecurite =Nsecurite;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Echelon = Echelon;
        this.DateNaissance = DateN;
        this.DateEmbauche = DateE;

        this.salaireBrut = this.base * this.nbHeures * 4;
        this.salaireNet = this.salaireBrut * 0.8;
    }



}
