package entwurfsmuster.kompositum;

public class Main {

    public static void main(String[] args){

        Blatt blatt1 = new Blatt("Blatt 1");
        Blatt blatt2 = new Blatt("Blatt 2");
        Blatt blatt3 = new Blatt("Blatt 3");

        Blatt blatt4 = new Blatt("Blatt 4");
        Blatt blatt5 = new Blatt("Blatt 5");
        Blatt blatt6 = new Blatt("Blatt 6");

        Kompositum kompositum1 = new Kompositum();
        Kompositum kompositum2 = new Kompositum();

        kompositum1.add(blatt1);
        kompositum1.add(blatt2);
        kompositum1.add(blatt3);

        kompositum2.add(blatt4);
        kompositum2.add(blatt5);
        kompositum2.add(blatt6);

        kompositum1.add(kompositum2);

        kompositum1.print();

    }



}
