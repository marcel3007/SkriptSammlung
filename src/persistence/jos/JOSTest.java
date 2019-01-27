package persistence.jos;


import java.io.*;

public class JOSTest {

    public static void main(String[] args){
        JOSTest test = new JOSTest();
        test.save("jos.dat", new MyClass(10, 20));
        test.load("jos.dat");
    }

    private void save(String filename, MyClass myclass) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            myclass.save(objectOutputStream);
            System.out.println("JOS: MyClass saved in " + filename);
            System.out.println("JOS: MyClass a: " + myclass.getA());
            System.out.println("JOS: MyClass b: " + myclass.getB());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void load(String filename){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            MyClass myClass = new MyClass(0,0);
            myClass.load(objectInputStream);

            System.out.println("JOS: MyClass loaded from " + filename);
            System.out.println("JOS: MyClass a: " + myClass.getA());
            System.out.println("JOS: MyClass b: " + myClass.getB());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
