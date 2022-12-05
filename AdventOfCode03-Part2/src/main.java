
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bob
 */
public class main {

    public static void loadFromTextFile(String fileName) throws FileNotFoundException, IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int counter = 0;
            String bigLine = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (counter != 3) {
                    bigLine = bigLine + line;
                    counter++;
                } else {
                    System.out.println(">>>>>>>>>>>>>>>>>>>" + bigLine);

                    char[] chars = bigLine.toCharArray();
                    Arrays.sort(chars);
                    String sorted = new String(chars);

                    boolean found = false;
                    char same = 'a';
                    for (int i = 0; i < sorted.length() - 1; i++) {
                        if (sorted.charAt(i) == sorted.charAt(i + 1)) {
                            found = true;
                            same = sorted.charAt(i);
                        }
                    }
                    
                    System.out.println(same);
                    if(){
                        
                    }
                    bigLine = "";
                    counter = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        loadFromTextFile("input.txt");
    }
}
