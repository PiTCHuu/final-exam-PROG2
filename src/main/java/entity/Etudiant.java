package entity;
import java.time.LocalDate;

public class Etudiant extends Personne {
    private final String groupe;
    private final Tuteur tuteur;

    public Etudiant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numeroTelephone, String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}



