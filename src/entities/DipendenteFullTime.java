package entities;

public class DipendenteFullTime extends Dipendente{
    public DipendenteFullTime(String matricola, TipiDipartimento tipiDipartimento) {
        super(matricola, 2500, tipiDipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio fisso per il lavoro a tempo pieno è di "+this.stipendio );
    }
}
