//imports
import java.util.Scanner;

//importing classes
import compontes.Deck;
import Helpful_Compontes.PrintingFiles;

public class test {
    //testing zone
    public static void main(String[] args) {
        //Scanner
        Scanner testScan = new Scanner(System.in);

        //important components
        PrintingFiles testFilePrinter = new PrintingFiles();

        //testing imports
        Deck testDeck = new Deck();

        System.out.println("Testing zone");
//        testDeck.test();
        for(int i = 0; i <= 4; i++){
            if(i == 0){ //for plains
                System.out.println("PLAINS");
                testDeck.setPlainsDeck();
                testFilePrinter.printFile(testDeck.getPlainsDeck());
            }
            else if(i == 1){ //for islands
                System.out.println("ISLAND");
                testDeck.setIslandDeck();
                testFilePrinter.printFile(testDeck.getIslandDeck());
            } else if (i == 2) { //for mountin
                System.out.println("MOUNTAIN");
                testDeck.setMountineDeck();
                testFilePrinter.printFile(testDeck.getMountineDeck());
            }
            else if(i == 3){ //for swamp
                System.out.println("SWAMP");
                testDeck.setSwampDeck();
                testFilePrinter.printFile(testDeck.getSwampDeck());
            }
            else{
                System.out.println("FOREST");
                testDeck.setForstDeck();
                testFilePrinter.printFile(testDeck.getForstDeck());
            }
        }

    }
}
