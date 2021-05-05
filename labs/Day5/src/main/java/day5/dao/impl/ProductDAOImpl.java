package day5.dao.impl;

import day5.dao.ProductDAO;
import day5.dao.UserDAO;

public class ProductDAOImpl implements ProductDAO {
    UserDAO userDAO;

    public ProductDAOImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public ProductDAOImpl() {
        System.out.println("ProductDAOImpl()\n");
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void init() {
        System.out.println("ProductDAO init method");
    }

    public void destroy() {
        System.out.println("ProductDAO destroy method");
    }

}
