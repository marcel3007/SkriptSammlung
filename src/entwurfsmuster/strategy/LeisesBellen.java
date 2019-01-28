package entwurfsmuster.strategy;

public class LeisesBellen implements Bellverhalten {

    @Override
    public void bellen() {
        System.out.println("LeisesBellen.bellen");
    }
}
