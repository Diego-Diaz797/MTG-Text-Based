package compontes;

//imports
import java.util.ArrayList;

//importing file reader
import Helpful_Compontes.File;


public class Deck {
    //private vars
    private ArrayList<String> forstDeck = new ArrayList<String>();
    private ArrayList<String> mountineDeck = new ArrayList<String>();
    private ArrayList<String> swampDeck = new ArrayList<String>();
    private ArrayList<String> islandDeck = new ArrayList<String>();
    private ArrayList<String> plainsDeck = new ArrayList<String>();

    //calling File.java so I can use the file reader
    File file = new File();

    //setting the list

    //plains deck
    public void setPlainsDeck() {
        //placing the Deck file into a list or array
        ArrayList<String> plainsDeck = file.fileReader("Text/Decks/PlainsDeck.txt");

        //adding the list or array to the PlainsDeck
        for(String card : plainsDeck){
          this.plainsDeck.add(card);
        }
    }

    //islands deck
    public void setIslandDeck(){
        //placing the Deck file into a list
        ArrayList<String> islandDeck = file.fileReader("Text/Decks/IslandDeck.txt");

        //adding the list to the IslandDeck
        for(String card : islandDeck){
            this.islandDeck.add(card);
        }
    }

    //mountain deck
    public void setMountineDeck() {
        //placeing the deck file into a list
        ArrayList<String> mountineDeck = file.fileReader("Text/Decks/MountainDeck.txt");

        //adding the list into mountineDeck
        for(String card : mountineDeck){
            this.mountineDeck.add(card);
        }
    }

    //swamp Deck
    public void setSwampDeck(){
        ArrayList<String> swampDeck = file.fileReader("Text/Decks/SwampDeck.txt");

        for(String card : swampDeck){
            this.swampDeck.add(card);
        }
    }

    //forest Deck
    public void setForstDeck(){
        ArrayList<String> forestDeck = file.fileReader("Text/Decks/ForestDeck.txt");

        for(String card : forestDeck){
            this.forstDeck.add(card);
        }
    }


    //getting the list

    //forest
    public ArrayList<String> getForstDeck() {
        return this.forstDeck;
    }

    //island
    public ArrayList<String> getIslandDeck() {
        return this.islandDeck;
    }

    //mountain
    public ArrayList<String> getMountineDeck() {
        return this.mountineDeck;
    }

    //plains
    public ArrayList<String> getPlainsDeck() {
        return this.plainsDeck;
    }

    //swamp
    public ArrayList<String> getSwampDeck() {
        return this.swampDeck;
    }
}
