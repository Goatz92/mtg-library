import model.Card;
import model.Deck;
import service.DeckParser;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filePath = "C:/tmp/decklist.txt";

        try{
            List<Card> deckCards = DeckParser.parseDeckListFromFile(filePath);
            for(Card card : deckCards) {
                System.out.println(card);
            }
        } catch (IOException e) {
            System.out.println("Error reading decklist file:" + e.getMessage());
        }
    }
}
