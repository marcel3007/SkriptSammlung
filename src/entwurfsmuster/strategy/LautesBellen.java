package entwurfsmuster.strategy;

public class LautesBellen implements Bellverhalten {

    @Override
    public void bellen() {
        System.out.println("LautesBellen.bellen");
    }
}
