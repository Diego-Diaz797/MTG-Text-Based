package Helpful_Compontes;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class File {
    //file reader
    public ArrayList<String> fileReader(String files){
        //trying, which will tell us if the file is there
        try{
            java.io.File file = new java.io.File(files);
            Scanner fileScanner = new Scanner(file);
            ArrayList<String> list = new ArrayList<String>();

            //reading the file line by line
            while(fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                list.add(line);
            }

            //closing the scanner
            fileScanner.close();

            //returning the list
            return list;
        }
        catch (FileNotFoundException e){ //the file was not scanned
            System.err.println("Error: File not found!");
            e.printStackTrace();
        }
        return null;
    }
}
