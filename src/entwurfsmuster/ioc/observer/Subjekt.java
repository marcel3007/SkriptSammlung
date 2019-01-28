package entwurfsmuster.ioc.observer;

import java.util.Observable;

class Subjekt extends Observable {

    private String name;

    Subjekt(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }
}
