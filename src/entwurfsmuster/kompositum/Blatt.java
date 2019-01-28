package entwurfsmuster.kompositum;

public class Blatt implements Komponente {

    private String name;

    Blatt(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Blatt.print: " + name);
    }
}
