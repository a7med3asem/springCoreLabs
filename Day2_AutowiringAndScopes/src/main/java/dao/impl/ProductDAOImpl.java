package dao.impl;

import dao.ProductDAO;
import dao.UserDAO;

public class ProductDAOImpl implements ProductDAO {
    UserDAO userDAO;

    public ProductDAOImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public ProductDAOImpl() {
        System.out.println("ProductDAOImpl()\n");
    }
}
