package day5.dao.impl;

import day5.dao.ProductDAO;
import day5.dao.UserDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//  InitializingBean, DisposableBean implement BeanPostProcessor
public class UserDAOImpl implements UserDAO, InitializingBean, DisposableBean {
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

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
