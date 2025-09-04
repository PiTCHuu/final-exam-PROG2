package entity;
import java.time.LocalDate;

public class Tuteur extends Personne {
    private final String lienAvecEtudiant;

    public Tuteur(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numeroTelephone, String lienAvecEtudiant) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.lienAvecEtudiant = lienAvecEtudiant;
    }
}
