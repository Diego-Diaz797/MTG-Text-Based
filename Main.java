import java.util.Scanner;
import java.util.ArrayList;
import Helpful_Compontes.File;
import Helpful_Compontes.Enter;
import Helpful_Compontes.PrintingFiles;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);

        //importing classes
        File file = new File();
        Enter enter = new Enter();
        PrintingFiles print = new PrintingFiles();

        //vars
        ArrayList<String> howToPlay = file.fileReader("Text/Rules.txt");

        //main code
        while (true) {
            try {
                System.out.println("Magic the Gathering\n Text Based Game");

                //match case that will to see what the player wants to choose
                System.out.println("\nPlease choose a number from 1 - 3\n" +
                        "1. Play the Game\n" +
                        "2. How to Play\n" +
                        "3. Exit");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Playing the game");
                        break;
                    case 2:
                        print.printFile(howToPlay);
                        enter.pressEnter();
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
}
