package entwurfsmuster.strategy;

public class Main {
    public static void main(String[] args) {

        Bellverhalten leisesBellen = new LeisesBellen();
        Bellverhalten lautesBellen = new LautesBellen();

        Hund husky = new Hund("Husky", lautesBellen);
        Hund labrador = new Hund("Labrador", leisesBellen);

        husky.bellen();
        labrador.bellen();

    }
}
