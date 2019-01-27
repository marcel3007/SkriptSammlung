package persistence.jbp;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class JBPTest {

    public static void main(String[] args){
        JBPTest test = new JBPTest();
        test.save("jbp.xml", new MyClass(10, 20));
        test.load("jbp.xml");
    }

    private void save(String filename, MyClass myclass){
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            myclass.save(encoder);
            System.out.println("JBP: MyClass saved in " + filename);
            System.out.println("JBP: MyClass a: " + myclass.getA());
            System.out.println("JBP: MyClass b: " + myclass.getB());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }


    private void load(String filename){
         /*
        JBP LOAD
         */

        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            MyClass myclass = new MyClass();
            myclass.load(decoder);

            System.out.println("JBP: MyClass loaded from " + filename);
            System.out.println("JBP: MyClass a: " + myclass.getA());
            System.out.println("JBP: MyClass b: " + myclass.getB());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
