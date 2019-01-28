package entwurfsmuster.ioc.observer;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {

        Subjekt subjekt = new Subjekt("Vicky");
        Observer observer = new MyObserver();

        subjekt.addObserver(observer);
        subjekt.setName("Marcel");


    }
}
