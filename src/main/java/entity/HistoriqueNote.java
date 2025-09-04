package entity;
import java.time.LocalDateTime;

public class HistoriqueNote {
    private double valeur;
    private LocalDateTime dateChangement;
    private String motif;

    public HistoriqueNote(double valeur, String motif) {
        this.valeur = valeur;
        this.dateChangement = LocalDateTime.now();
        this.motif = motif;
    }
}
