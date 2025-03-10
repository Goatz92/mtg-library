import dao.CardDAO;
import model.Card;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            //Initialize CardDAO
            CardDAO cardDAO = new CardDAO();
            cardDAO.createTable();

            //Add some cards
//            cardDAO.addCard(new Card(1L, "Black Lotus", "Alpha","Rare", "Artifact", 1));
//            cardDAO.addCard(new Card(2L, "Shivan Dragon", "Alpha", "Rare", "Red", 3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
