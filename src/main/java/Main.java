import dao.CardDAO;
import model.Card;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        //Add some cards
        CardDAO.addCard(new Card(1, "Black Lotus", "1", "Artifact", 0, 0, "rare", 1));

    }
}
