package ru.mail.evmenova.task30;

import java.io.*;

public class Task30 {

    protected void writeToFile(String content, String fileName) {

        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(fileName, true));
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected StringBuilder readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("No file");
                return null;
            }
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(fileName));
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
            return stringBuilder;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
