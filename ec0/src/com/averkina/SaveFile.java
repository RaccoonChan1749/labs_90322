package com.averkina;
import java.io.*;

public class SaveFile<T> implements Serializable {
    public void serialize(T obj, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public T deserialize(String fileName) {
        T obj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (T) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }

        return obj;
    }
    public T deserialize(String fileName, boolean printError) {
        T obj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (T) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException i) {
            if (printError) {
                i.printStackTrace();
            }
            return null;
        } catch (ClassNotFoundException c) {
            if (printError) {
                System.out.println("Class not found");
                c.printStackTrace();
            }
            return null;
        }

        return obj;
    }
}
