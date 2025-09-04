package entity;
import java.time.LocalDate;

public class Enseignant extends Personne {
    private final String specialite;

    public Enseignant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numeroTelephone, String specialite) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.specialite = specialite;
    }

}


