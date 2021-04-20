package factories;

import dao.ProductDAO;
import dao.UserDAO;
import services.DAOService;
import services.Service1;
import services.impl.DAOServiceImpl;
import services.impl.Service1Impl;

public class ServiceFactory {
    public ServiceFactory() {
        System.out.println("ServiceFactory()\n");
    }

    public Service1 createService1Impl() {
        System.out.println("Service1 createService1Impl()");
        return new Service1Impl();
    }

    public Service1 createService1Impl(int age) {
        System.out.println("Service1 createService1Impl(int age)");
        return new Service1Impl(age);
    }

    public Service1 createService1Impl(String name) {
        return new Service1Impl(name);
    }

    public Service1 createService1Impl(int age, String name) {
        return new Service1Impl(age, name);
    }

    public DAOService createDAOService(ProductDAO productDAO) {
        return new DAOServiceImpl(productDAO);
    }

    public DAOService createDAOService(UserDAO userDAO, ProductDAO productDAO) {
        return new DAOServiceImpl(userDAO, productDAO);
    }
}
