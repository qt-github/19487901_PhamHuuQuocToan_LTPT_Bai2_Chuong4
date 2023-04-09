package dao;

import database.Connection;
import entities.Product;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ProductDAO {
    private EntityManager entityManager;

    public ProductDAO() {
        entityManager = Connection.getInstance().getEntityManagerFactory().createEntityManager();
    }
    //Tìm danh sách sản phẩm có giá cao nhất
    public List<Product> findProductWithMaxPrice() {
        List<Product> products = entityManager.createQuery("select p from Product p where p.price = (select max(p1.price) from Product p1)", Product.class).getResultList();
        products.forEach(System.out::println);
        return products;
    }
}
