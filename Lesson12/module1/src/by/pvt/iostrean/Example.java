package by.pvt.iostrean;


import java.io.*;

public class Example {



    public void writeToFile(byte[] content, String fileName) {

        try (FileOutputStream fileOutputStream =
                    new FileOutputStream(fileName, true)){
            fileOutputStream.write(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] readFromFile(String fileName) {

        try {
            File file = new File(fileName);
            if (!file.exists()){
                return null;
            }
            System.out.println(file.getAbsolutePath()+" "+file.length()+"bytes");
            FileInputStream fileInputStream =
                    new FileInputStream(fileName);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStream.read(bytes);
            return bytes;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void readStringFromFile(String fileName){
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(fileName));
            while (bufferedReader.ready()) {
                String s= bufferedReader.readLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
