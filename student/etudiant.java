package student;

public class etudiant {

    private int num;
    private String nom;
    private String prenom;


    public etudiant(int num, String nom, String prenom) {
        this.num = num;
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
    }

    public void affiche(){
        System.out.println(this.num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


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
}

