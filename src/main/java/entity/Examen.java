package entity;
import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String titre;
    private Cours cours;
    private LocalDateTime dateHeure;
    private double coefficient;

    public Examen(int id, String titre, Cours cours, LocalDateTime dateHeure, double coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }
    public double getCoefficient() {
        return coefficient;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Cours getCours() {
        return cours;
    }
    public void setCours(Cours cours) {
        this.cours = cours;
    }
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }
    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}


