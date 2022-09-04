package file;


import java.io.*;

public class FileUtil implements DataWriteable, DataReadable {

    @Override
    public void writeDataToFile(Object[] data, String fileName) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Object readDataFromFile(String fileName) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
