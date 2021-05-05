package day5.services.impl;

import day5.dao.ProductDAO;
import day5.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import day5.services.DAOService;

public class DAOServiceImpl implements DAOService {
    private ProductDAO productDAO;
    private UserDAO userDAO;

    public DAOServiceImpl() {
        System.out.println("DAOServiceImpl()\n");
    }

    @Autowired(required = false)
    public DAOServiceImpl(ProductDAO productDAO) {
        System.out.println("DAOServiceImpl(ProductDAO productDAO)\n");
        this.productDAO = productDAO;
    }

    @Autowired(required = false)
    public DAOServiceImpl(UserDAO userDAO) {
        System.out.println("DAOServiceImpl(UserDAO userDAO)\n");
        this.userDAO = userDAO;
    }

//  multiple non required constructors .. invoke that is, the constructor that has the largest number of arguments
    @Autowired(required = false)
    public DAOServiceImpl(UserDAO userDAO, ProductDAO productDAO) {
        System.out.println("DAOServiceImpl(ProductDAO productDAO, UserDAO userDAO)\n");
        this.productDAO = productDAO;
        this.userDAO = userDAO;
    }



    public void setProductDAO(ProductDAO productDAO) {
        System.out.println("setProductDAO(ProductDAO productDAO)\n");
        this.productDAO = productDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        System.out.println("setUserDAO(UserDAO userDAO)\n");
        this.userDAO = userDAO;
    }
}
