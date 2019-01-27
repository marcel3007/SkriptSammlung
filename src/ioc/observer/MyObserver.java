package ioc.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("MyObserver.update");
        Subjekt subjekt = (Subjekt) o;
        System.out.println("getName: " + subjekt.getName());
        System.out.println("Arg: " + arg);
    }
}
