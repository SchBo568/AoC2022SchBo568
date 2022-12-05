
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SchBo568
 */
public class main {
    
    private static ArrayList<String> enemyChoice = new ArrayList<>();
    private static ArrayList<String> playerChoice = new ArrayList<>();

    public static void loadFromTextFile(String fileName) throws FileNotFoundException, IOException {
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            float temp = 0;
            while ((line = bufferedReader.readLine()) != null) {
                enemyChoice.add(String.valueOf(line.charAt(0)));
                playerChoice.add(String.valueOf(line.charAt(2)));
            }
        }
    }

    public static int getResult1() {
        int result = 0;
        for(int i = 0; i < enemyChoice.size(); i++){
            if(enemyChoice.get(i).equals("A")){ // chose rock
                if(playerChoice.get(i).equals("X")){
                    result = result + 3; // draw
                    result = result + 1; // player chose rock
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 6; // win
                    result = result + 2; // player chose paper
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 0; // loss
                    result = result + 3; // player chose scissors
                }
            }
            else if(enemyChoice.get(i).equals("B")){ //chose paper
                if(playerChoice.get(i).equals("X")){
                    result = result + 0; // loss
                    result = result + 1; // player chose rock
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 3; // draw
                    result = result + 2; // player chose paper
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 6; // win
                    result = result + 3; // player chose scissors
                }
            }
            else if(enemyChoice.get(i).equals("C")){ //chose scissors
                if(playerChoice.get(i).equals("X")){
                    result = result + 6; // win
                    result = result + 1; // player chose rock
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 0; // loss
                    result = result + 2; // player chose paper
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 3; // draw
                    result = result + 3; // player chose scissors
                }
            }
        }
        return result;
    }
    
    public static int getResult2() {
        // X = LOSE
        // Y = DRAW
        // Z = WIN
        int result = 0;
        for(int i = 0; i < enemyChoice.size(); i++){
            if(enemyChoice.get(i).equals("A")){ // chose rock
                if(playerChoice.get(i).equals("X")){
                    result = result + 0; // loss
                    result = result + 3; // player chose scissors
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 3; // draw
                    result = result + 1; // player chose rock
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 6; // win
                    result = result + 2; // player chose paper
                }
            }
            else if(enemyChoice.get(i).equals("B")){ //chose paper
                if(playerChoice.get(i).equals("X")){
                    result = result + 0; // loss
                    result = result + 1; // player chose rock
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 3; // draw
                    result = result + 2; // player chose paper
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 6; // win
                    result = result + 3; // player chose scissors
                }
            }
            else if(enemyChoice.get(i).equals("C")){ //chose scissors
                if(playerChoice.get(i).equals("X")){
                    result = result + 0; // loss
                    result = result + 2; // player chose paper
                }
                else if(playerChoice.get(i).equals("Y")){
                    result = result + 3; // draw
                    result = result + 3; // player chose scissors
                }
                else if(playerChoice.get(i).equals("Z")){
                    result = result + 6; // win
                    result = result + 1; // player chose rock
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            loadFromTextFile("./input.txt");
            System.out.println(getResult2());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
