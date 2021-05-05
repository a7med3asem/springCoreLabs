package day5.dao.impl;

import day5.dao.ProductDAO;
import day5.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    private ProductDAO productDAO;

    public UserDAOImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public UserDAOImpl() {
        System.out.println("UserDAOImpl()\n");
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
}
