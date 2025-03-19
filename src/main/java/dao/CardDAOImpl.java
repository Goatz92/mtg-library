//TODO modify methods to match the new model fields

//package dao;
//
//import dao.exceptions.CardDAOException;
//import model.Card;
//import service.DBUtil;
//
//import javax.management.relation.RelationSupport;
//import javax.xml.parsers.DocumentBuilder;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CardDAOImpl implements ICardDAO{
//
//    @Override
//    public Card insert(Card card) throws CardDAOException {
//        String sql = "INSERT INTO cards (name, set_name, card_type, " +
//                "rarity, mana_cost, text, power, toughness)" +
//                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        Card insertedCard = null;
//
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql,
//                     Statement.RETURN_GENERATED_KEYS)) {
//            ps.setString(1, card.getName());
//            ps.setString(2, card.getSetName());
//            ps.setString(3, card.getCardType());
//            ps.setString(4, card.getRarity());
//            ps.setString(5, card.getManaCost());
//            ps.setString(6, card.getText());
//            ps.setInt(7, card.getPower());
//            ps.setString(8,card.getUuid());
//
//            ResultSet rsGeneratedKeys = ps.getGeneratedKeys();
//            if (rsGeneratedKeys.next()) {
//                int generatedId = rsGeneratedKeys.getInt(1);
//                insertedCard = getCardById(generatedId);
//            }
//            return insertedCard;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new CardDAOException("SQL error in inserting Card with name: " + card.getName());
//        }
//    }
//
//    @Override
//    public Card update(Card card) throws CardDAOException {
//        String sql = "UPDATE cards SET name = ?, set_name = ?, card_type = ?, " +
//                "rarity = ?, mana_cost = ?, text = ?, power = ?, toughness = ?, WHERE id = ?";
//        Card updatedCard;
//
//        try (Connection connection = DBUtil.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql)) {
//
//            ps.setString(1, card.getName());
//            ps.setString(2, card.getSetName());
//            ps.setString(3, card.getCardType());
//            ps.setString(4, card.getRarity());
//            ps.setString(5, card.getManaCost());
//            ps.setString(6, card.getText());
//            ps.setInt(7, card.getPower());
//            ps.setString(8,card.getUuid());
//
//            ps.executeUpdate();
//
//            updatedCard = getCardById(card.getId());
//
//            return updatedCard;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            //logging
//            throw new CardDAOException("SQL error in updating card with name: " + card.getName());
//        }
//    }
//
//    @Override
//    public void delete(Integer id) throws CardDAOException {
//        String sql = "DELETE FROM cards WHERE ID = ?";
//
//        try (Connection connection = DBUtil.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql)) {
//
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new CardDAOException("SQL error in deleting card with id: " + id);
//
//        }
//    }
//
//    @Override
//    public Card getCardById(Integer id) throws CardDAOException {
//        String sql = "SELECT * FROM cards WHERE id = ?";
//        Card card = null;
//        ResultSet rs;
//
//        try (Connection connection = DBUtil.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql)) {
//
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                card = new Card(rs.getInt("id"), rs.getString("name"), rs.getString("set_name"),
//                        rs.getString("card_type"), rs.getString("rarity"), rs.getString("mana_cost"),
//                        rs.getString("text"), rs.getInt("power"), rs.getInt("toughness"), rs.getString("uuid"));
//            }
//            return card;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new CardDAOException("SQL error in get by id with id: " + id);
//        }
//    }
//
//    @Override
//    public List<Card> getAll() throws CardDAOException {
//        String sql = "SELECT * FROM cards";
//        Card card;
//        List<Card> cards = new ArrayList<>();
//        ResultSet rs;
//
//        try (Connection connection = DBUtil.getConnection();
//        PreparedStatement ps = connection.prepareStatement(sql)) {
//
//            rs = ps.executeQuery();
//
//            while(rs.next()) {
//                card = new Card(rs.getInt("id"), rs.getString("name"), rs.getString("set_name"),
//                        rs.getString("card_type"), rs.getString("rarity"), rs.getString("mana_cost"),
//                        rs.getString("text"), rs.getInt("power"), rs.getInt("toughness"), rs.getString("uuid"));
//                cards.add(card);
//            }
//        } catch (SQLException e) {
//            throw new CardDAOException("SQL error in getting all cards");
//        }
//        return cards;
//    }
//
//    @Override
//    public Card getByUUID(String uuid) throws CardDAOException {
//        String sql ="SELECT * FROM cards WHERE uuid = ?";
//        Card card = null;
//        ResultSet rs;
//
//        try(Connection connection = DBUtil.getConnection();
//            PreparedStatement ps = connection.prepareStatement(sql)) {
//
//            ps.setString(1, uuid);
//            rs = ps.executeQuery();
//
//            if(rs.next()) {
//                card = new Card(rs.getInt("id"), rs.getString("name"), rs.getString("set_name"),
//                        rs.getString("card_type"), rs.getString("rarity"), rs.getString("mana_cost"),
//                        rs.getString("text"), rs.getInt("power"), rs.getInt("toughness"), rs.getString("uuid"));
//            }
//            return card;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new CardDAOException("Error in getting card with uuid: " + uuid);
//        }
//    }
//
//    @Override
//    public List<Card> getCardByName(String name) throws CardDAOException {
//        List <Card> cards = new ArrayList<>();
//        Card card;
//        String sql = "SELECT * FROM cards WHERE name LIKE ?";
//        ResultSet rs;
//
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, name + "%");
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                card = new Card(rs.getInt("id"), rs.getString("name"), rs.getString("set_name"),
//                        rs.getString("card_type"), rs.getString("rarity"), rs.getString("mana_cost"),
//                        rs.getString("text"), rs.getInt("power"), rs.getInt("toughness"), rs.getString("uuid"));
//                cards.add(card);
//            }
//            return cards;
//        } catch (SQLException e) {
//            throw new CardDAOException("SQL error in getting with name: " + name);
//        }
//    }
//
//}
