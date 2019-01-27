package persistence.jbp;

import java.beans.*;
import java.time.LocalDateTime;

public class MyClass {

    private int a;
    private int b;

    public MyClass() {
        a = 0;
        b = 0;
    }

    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void init(int a, int b){
        this.a = a;
        this.b = b;
    }

    void save(XMLEncoder encoder) {

        if (encoder == null)
            throw new IllegalArgumentException("encoder null");

        // source https://stackoverflow.com/a/41374144/6542041
        encoder.setPersistenceDelegate(LocalDateTime.class,
                new PersistenceDelegate() {
                    @Override
                    protected Expression instantiate(Object obj, Encoder encdr) {
                        LocalDateTime localDate = (LocalDateTime) obj;
                        return new Expression(localDate,
                                LocalDateTime.class,
                                "parse",
                                new Object[]{localDate.toString()});
                    }
                });

        encoder.writeObject(this);

    }

    void load(XMLDecoder decoder) {

        if (decoder == null)
            throw new IllegalArgumentException("decoder null");

        MyClass myClass = (MyClass) decoder.readObject();
        init(myClass.getA(), myClass.getB());

    }
}
