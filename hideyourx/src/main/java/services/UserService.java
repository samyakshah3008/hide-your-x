package services;

import java.sql.SQLException;

import dao.UserDAO;
import models.User;

public class UserService {
    public static Integer saveUser(User user) {
        try {
            if (UserDAO.isExists(user.getEmail())) {
                return 0;
            } else {
                return UserDAO.saveUser(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
