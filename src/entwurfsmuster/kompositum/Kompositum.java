package entwurfsmuster.kompositum;


import java.util.LinkedList;
import java.util.List;

public class Kompositum implements Komponente {

    private List<Komponente> list = new LinkedList<>();

    void add(Komponente k){
        list.add(k);
    }

    @Override
    public void print() {
        for(Komponente k : list){
            k.print();
        }
    }
}
