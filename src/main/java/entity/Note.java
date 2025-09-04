package entity;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Note {
    private Etudiant etudiant;
    private Examen examen;
    private double valeurActuelle;
    private List<HistoriqueNote> historique;

    public Note(Etudiant etudiant, Examen examen, double valeurInitiale) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.valeurActuelle = valeurInitiale;
        this.historique = new ArrayList<>();
        this.historique.add(new HistoriqueNote(valeurInitiale, "Note initiale"));
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }
    public Examen getExamen() {
        return examen;
    }
    public double getValeurActuelle() {
        return valeurActuelle;
    }

    public void modifierNote(double nouvelleValeur, String motif) {
        this.valeurActuelle = nouvelleValeur;
        this.historique.add(new HistoriqueNote(nouvelleValeur, motif));
    }

    public double getExamGrade(Examen examen, Etudiant etudiant, Instant t) {
        for (Note note) {
        }
        return 0.0;
    }
}

