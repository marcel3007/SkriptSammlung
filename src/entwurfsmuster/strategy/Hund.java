package entwurfsmuster.strategy;

class Hund {

    private String typ;
    private Bellverhalten bellverhalten;

    Hund(String typ, Bellverhalten bellverhalten){
        this.typ = typ;
        this.bellverhalten = bellverhalten;
    }

    void bellen(){
        System.out.print("Typ: " + typ + " ");
        bellverhalten.bellen();
    }
}
