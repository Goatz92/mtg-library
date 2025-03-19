package service;

import model.Card;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeckParser {

    public static List<Card> parseDeckListFromFile(String FILE_PATH) throws IOException {
        List<Card> cards = new ArrayList<>();
        boolean inSideboard = false;
        Card card = null;

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while((line = br.readLine()) != null) {
                line = line.trim();

                if(line.isEmpty()){
                    continue;
                }

                if(line.equalsIgnoreCase("Sideboard")) {
                    inSideboard = true;
                    continue;
                }

                String[] parts = line.split(" ");
                if(parts.length > 1) {
                    try {
                        int quantity = Integer.parseInt(parts[0]);
                        String cardName = String.join(" ", Arrays.copyOfRange(parts, 1, parts.length));

                        card = new Card(null, cardName, quantity);
                        for (int i = 0; i < quantity; i++) {
                            cards.add(card); // Add the same card multiple times based on quantity
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
            }
        }
        return cards;
    }
}
