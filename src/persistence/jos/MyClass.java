package persistence.jos;

import java.beans.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.LocalDateTime;

class MyClass implements Serializable {

    private int a;
    private int b;



    MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }


    private void init(int a, int b){
        this.a = a;
        this.b = b;
    }

    void save(ObjectOutput output) throws IOException {

        if (output == null)
            throw new IllegalArgumentException("ObjectOutput null");

        output.writeObject(this);

        output.flush();
        output.close();
    }

    void load(ObjectInput input) throws ClassNotFoundException, IOException {

        if (input == null)
            throw new IllegalArgumentException("ObjectInput null");

        MyClass my = (MyClass) input.readObject();
        init(my.getA(), my.getB());

        input.close();
    }
}
