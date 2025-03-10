package model;

public class Card {

    private int id;
    private String name;
    private String cardNum;
    private String cardType;
    private int power;
    private int toughness;
    private String rarity;
    private int setId;

    public Card () {}

    public Card(int id, String name, String cardNum, String cardType, int power, int toughness, String rarity, int setId) {
        this.id = id;
        this.name = name;
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.power = power;
        this.toughness = toughness;
        this.rarity = rarity;
        this.setId = setId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getSetId() {
        return setId;
    }

    public void setSetId(int setId) {
        this.setId = setId;
    }
}
