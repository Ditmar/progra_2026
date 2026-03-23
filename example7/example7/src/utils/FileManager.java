package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import contact.Contact;

public class FileManager {
    static String path = "/Users/ditmar/progra2.2026/example7/example7/file/contact-list.txt";
    public static String readRaw() {
        FileReader reader;
        try {
            reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String fileData = "";
            String totalData = "";
            while ((fileData = bufferedReader.readLine()) != null) {
                totalData += fileData;
            }
            bufferedReader.close();
            return totalData;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static boolean save(Contact contact) {
        String lastData = readRaw();
        FileWriter file;
        try {
            file = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(file);
            String newRaw = contact.getRaw();
            lastData += "\n" + newRaw ;
            writer.write(lastData);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static HashMap<String, Contact> load() {
        String rawData = readRaw();
        String[] lines = rawData.split("\n");
        HashMap<String, Contact> localList = new HashMap<>();
        for (String line : lines) {
            String[] cad  = line.split(",");
            Contact newContact = new Contact(cad[0], cad[1], cad[2]);
            newContact.setCel(cad[4]);
            newContact.setAddress(cad[3]);
            localList.put(newContact.getEmail(), newContact);
        }
        return localList;
    }
}
