import entities.*;

public class Main {
    public static void main(String[] args) {

//        Dipendente Michela = new Dipendente("040799",1.500, TipiDipartimento.AMMINISTRAZIONE);
//        System.out.println( "Dipendente Michela:"+Michela);
//
//        Dipendente Roberta = new Dipendente("070324",1.500, TipiDipartimento.VENDITE);
//        System.out.println( "Dipendente Roberta:"+Roberta);
//
//        Dipendente Riccardo = new Dipendente("080324",1.800, TipiDipartimento.PRODUZIONE);
//        System.out.println( "Dipendente Riccardo:"+Riccardo);
//
//        Dipendente [] Dipendenti = {Michela,Roberta,Riccardo};
//
//        for (int i = 0; i < Dipendenti.length; i++) {
//            Dipendente currentDip = Dipendenti[i];
//            System.out.println("La matricola del dipendente  è " + currentDip.getMatricola());
//        }

        DipendenteFullTime Michela = new DipendenteFullTime("040799",TipiDipartimento.PRODUZIONE);
//        System.out.println("Dipendente Michela:"+Michela);

        DipendentePartTime Roberta = new DipendentePartTime("040799",1250,TipiDipartimento.AMMINISTRAZIONE);
//        System.out.println("Dipendente Roberta:"+Roberta);

        Dirigente Riccardo = new Dirigente("070324",3500,TipiDipartimento.VENDITE);
//        System.out.println("Dirigente Riccardo: "+Riccardo);


        Dipendente[] dipendenti = {Michela, Roberta, Riccardo};

        for (Dipendente dipendente : dipendenti) {
            dipendente.calculateSalary();
        }

        Volontario Giancarlo = new Volontario("Giancarlo",27,"Ingegnere informatico");

        Checkin[] checkinArray = {Michela, Roberta, Riccardo, Giancarlo};

        for (Checkin persona : checkinArray) {
            persona.checkIn();
        }
    }

}