package system_product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductReader {
    public static void readProducts(String filename) {
        BufferedReader reader = null;
        File file = new File(filename);
        int count = 0;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            
            System.out.println("Product List");
            String line = null;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    System.out.println(line);
                    count++;
                }
            }

            System.out.println("Total products: " + count + " item(s)");
        
        } catch (FileNotFoundException e) {
            System.out.println("Product file not found");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}