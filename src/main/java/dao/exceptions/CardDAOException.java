package dao.exceptions;

import java.io.Serial;

public class CardDAOException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public CardDAOException (String s) {
        super (s);
    }
}
