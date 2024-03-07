package entities;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;

    public DipendentePartTime(String matricola, double stipendioTotale, TipiDipartimento tipiDipartimento) {
        super(matricola, stipendioTotale, tipiDipartimento);
        this.oreLavorate = 69;
    }

    @Override
    public void calculateSalary() {
        // Calcolo dello stipendio basato sulle ore lavorate e lo stipendio orario
        double stipendioTotale = oreLavorate * 10;
        System.out.println("Lo stipendio calcolato è: " + stipendioTotale);
    }
}
