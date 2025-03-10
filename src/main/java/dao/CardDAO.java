package dao;

import model.Card;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CardDAO {

    private static final String URL = "jdbc:h2:mem:mtg-library";
    private static final String USER = "";
    private static final String PASSWORD = "";

    //JDBC Connection
    private Connection connection;

    public CardDAO() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create table if it doesn't exist
    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS cards (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "set VARCHAR(255), " +
                "rarity VARCHAR(50), " +
                "color VARCHAR(50), " +
                "quantity INT)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }

    public void addCard(Card card) throws SQLException {
        String sql = "INSERT INTO card (name, set, rarity, color, quantity) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, card.getName());
            pstmt.setString(2, card.getSet());
            pstmt.setString(3, card.getRarity());
            pstmt.setString(4, card.getColor());
            pstmt.setInt(5, card.getQuantity());
            pstmt.executeUpdate();
        }
    }

    public List<Card> getAllCards() throws SQLException {
        List<Card> cards = new ArrayList<>();
        String sql = "SELECT * from cards";
        try(Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Card card = new Card();
                card.setId(rs.getLong("id"));
                card.setName(rs.getString("name"));
                card.setSet(rs.getString("set"));
                card.setRarity(rs.getString("rarity"));
                card.setColor(rs.getString("color"));
                card.setQuantity(rs.getInt("quantity"));
                cards.add(card);
            }
        }
        return cards;
    }

}
