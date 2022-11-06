package application;

import student.etudiant;
import volee.classe;

public class lanceur {

    public static void main(String[] args) {

        etudiant e =new etudiant(1,"reda","saci");
        e.affiche();

        System.out.println("entrer le nom et prenom des etudaints svp :");

        classe c =new classe("Esig2","2022");
        c.afficher_tab();



    }
}
