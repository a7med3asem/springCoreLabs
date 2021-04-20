package dao.impl;

import dao.ProductDAO;
import dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    private ProductDAO productDAO;

    public UserDAOImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public UserDAOImpl() {
        System.out.println("UserDAOImpl()\n");
    }
}
