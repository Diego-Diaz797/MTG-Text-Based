import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);

        //main code
        while(true){
            try{
                System.out.println("Magic the Gathering\n Text Based Game");

                //match case that will to see what the player wants to choose
                System.out.println("\nPlease choose a number from 1 - 3\n" +
                        "1. Play the Game\n" +
                        "2. How to Play\n" +
                        "3. Exit");
                int choice = scan.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Playing the game");
                        break;
                    case 2:
                        fileReader();
                        pressEnter();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a number from 1 - 3");
                }
            } catch (Exception e) {
                System.out.println("Please enter a number");
                String a = scan.next();
            }
        }
    }

    //pressing enter to continue
    public static void pressEnter(){
        Scanner enter = new Scanner(System.in);
        String contuing = enter.nextLine();
    }

    //file reader
    public static void fileReader(){
        //trying, which will tell us if the file is there
        try{
            File file = new File("Text/Rules.txt");
            Scanner fileScanner = new Scanner(file);

            //reading the file line by line
            while(fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            //closing the scanner
            fileScanner.close();
        }
        catch (FileNotFoundException e){ //the file was not scanned
            System.err.println("Error: File not found!");
            e.printStackTrace();
        }
    }
}
