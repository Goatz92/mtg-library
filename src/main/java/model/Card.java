package model;

public class Card {
    private Long id;
    private String name;
    private String set;
    private String rarity;
    private String color;
    private int quantity;

    public Card () {}

    public Card(Long id, String name, String set, String rarity,
                String color, int quantity) {
        this.id = id;
        this.name = name;
        this.set = set;
        this.rarity = rarity;
        this.color = color;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", set='" + set + '\'' +
                ", rarity='" + rarity + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
