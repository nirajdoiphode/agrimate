/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

/**
 *
 * @author USER
 */
// File: com/myapp/DataStore.java
// File: com/myapp/DataStore.java

import java.io.*;

public class DataStore {
    
    private static final String FILE_PATH = "D:\\AGRIMATE\\Agrimate\\src\\Data\\CityData";

    // Method to write data to a file
    public void writeData(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(data);
            System.out.println("Data written to file: " + data);
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public String readData() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading data: " + e.getMessage());
        }
        return data.toString();
    }
}

