package model;

public class Deck {
   private Integer deckId;
   private String deckName;

   public Deck() {

   }

    public Deck(Integer deckId, String deckName) {
        this.deckId = deckId;
        this.deckName = deckName;
    }

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }
}
