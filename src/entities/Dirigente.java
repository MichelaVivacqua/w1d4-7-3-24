package entities;

public class Dirigente extends Dipendente{
    public Dirigente(String matricola, double stipendio, TipiDipartimento tipiDipartimento) {
        super(matricola, stipendio, tipiDipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio fisso per il dirigente "+this.stipendio );
    }

    @Override
    public void checkIn() {
        System.out.println("Turno dalle 9 alle 13");
    }
}
