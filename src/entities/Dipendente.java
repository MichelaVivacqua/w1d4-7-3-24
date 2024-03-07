package entities;

public class Dipendente {
   protected String matricola;
   protected double stipendio;
    protected TipiDipartimento tipiDipartimento;

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }


    public TipiDipartimento getTipiDipartimento() {
        return tipiDipartimento;
    }

    public void setTipiDipartimento(TipiDipartimento tipiDipartimento) {
        this.tipiDipartimento = tipiDipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", tipiDipartimento=" + tipiDipartimento +
                '}';
    }

    public Dipendente(String matricola, double stipendio, TipiDipartimento tipiDipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.tipiDipartimento = tipiDipartimento;

}}
