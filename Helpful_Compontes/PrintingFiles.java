package Helpful_Compontes;

import java.util.ArrayList;

public class PrintingFiles {
    public void printFile(ArrayList<String> file){
        //loop for the ammount of lines in the file
        for(String line : file){
            System.out.println(line);
        }
    }
}
