package model;

public class Card {
    private Integer cardId;
    private String name;
    private Integer quantity;

    public Card() {

    }

    public Card(Integer cardId, String name, Integer quantity) {
        this.cardId = cardId;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Card{" + "cardId=" + cardId + ", name='" + name + '\'' + ", quantity=" + quantity + '}';
    }
}