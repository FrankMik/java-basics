package oop.vererbung2.schritt7;

public class Main {
    public static void main(String[] args) {
        Motor bMotor = new Motor(174, "Benziner", 50);
        bMotor.setVerbrauchAuf100km(5.5);
        FahrWerk fWerk = new FahrWerk("Stall", "Standart");
        VerbrennerAuto verbAu = new VerbrennerAuto("BMW", "schwarz", bMotor , fWerk);
        Fahrer bFahrer = new Fahrer("Peter", 36);
        verbAu.setFahrer(bFahrer);
        verbAu.info();

        System.out.println("################################################");
        
        Motor m1 = new Motor(250, "Electro", 150);
        m1.setVerbrauchAuf100km(85);
        EAuto eAuto = new EAuto("Tesla", "weiß", m1, new FahrWerk("Plastik", "Leicht"));
        Fahrer eFahrer = new Fahrer("Max", 17);
        eAuto.setFahrer(eFahrer);
        eAuto.info();
    }
}
