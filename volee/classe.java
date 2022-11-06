package volee;

import student.etudiant;

import java.util.Scanner;


public class classe {

    private String nom;
    private String annee;

    //je luis dit que cette classe elle contient maximum 3
    private etudiant[] tab_etudiant=new etudiant[5];


    //créé un constructeur qui inclure de remplire le tableau etudiant

    public classe(String nom, String annee) {
        this.nom = nom;
        this.annee = annee;

        for (int i=0; i < tab_etudiant.length; i++){
            Scanner sc=new Scanner(System.in);
            String v_nom=sc.next();
            String v_prenom=sc.next();



            tab_etudiant[i]=new etudiant(i,v_nom,v_prenom);
        }
    }

    // afficher les etudaints

    public void afficher_tab(){
        System.out.println("la classe :"+this.nom+this.annee+" se compose de :");
        for(int i=0; i < tab_etudiant.length; i++){
           System.out.println("etudiant :"+ tab_etudiant[i].getNum()+" " + tab_etudiant[i].getNom()+" "+ tab_etudiant[i].getPrenom());
        }
    }

}
