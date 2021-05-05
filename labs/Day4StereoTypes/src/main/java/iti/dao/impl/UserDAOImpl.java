package iti.dao.impl;

import iti.dao.ProductDAO;
import iti.dao.UserDAO;

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

    public void init() {
        System.out.println("UserDAO init method");
    }

    public void destroy() {
        System.out.println("UserDAO destroy method");
    }
}
