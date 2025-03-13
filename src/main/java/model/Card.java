package model;

public class Card {
    private Integer id;
    private String name;
    private String setName;
    private String cardType;
    private String rarity;
    private String manaCost;
    private String text;
    private Integer power;
    private Integer toughness;
    private String uuid;

    public Card(){

    }

    public Card(Integer id, String name,
                String setName, String cardType,
                String rarity, String manaCost,
                String text, Integer power, Integer toughness, String uuid) {
        this.id = id;
        this.name = name;
        this.setName = setName;
        this.cardType = cardType;
        this.rarity = rarity;
        this.manaCost = manaCost;
        this.text = text;
        this.power = power;
        this.toughness = toughness;
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getToughness() {
        return toughness;
    }

    public void setToughness(Integer toughness) {
        this.toughness = toughness;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}