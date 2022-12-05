
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SchBo568
 */
public class main {

    private static ArrayList<Float> calories = new ArrayList<>();

    public static void loadFromTextFile(String fileName) throws FileNotFoundException, IOException {
        calories.clear();
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            float temp = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isBlank()) {
                    temp = temp + Float.valueOf(line);
                } else {
                    calories.add(temp);
                    temp = 0;
                }
            }
        }
    }
    
    public static float getMax(){
        float max = 0;
        int maxPosition = 0;
        for (int i = 0; i < calories.size(); i++) {
            if(calories.get(i) > max){
                max = calories.get(i);
                maxPosition = i;
            }
        }
        calories.remove(maxPosition);
        return max;
    }

    public static void main(String[] args) {
        try {
            loadFromTextFile("./input.txt");
            float total = 0;
            //System.out.println("---------1:" + getMax());
            total=total+getMax();
            //System.out.println("---------2:" + getMax());
            total=total+getMax();
            //System.out.println("---------3:" + getMax());
            total=total+getMax();
            System.out.println("---------Total: " + total);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
