package app;

import dao.BrandDAO;
import database.Connection;
import entities.Brand;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;


public class App {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Connection.getInstance().getEntityManagerFactory();
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tr = em.getTransaction();
        BrandDAO brandDAO = new BrandDAO();
        // Get brand by id
//        Brand b = brandDAO.getBrandById(10);
//        System.out.println(b);

        // Get all brands
//        brandDAO.getAllBrands().forEach(System.out::println);

        // Add brand
        Brand b = new Brand(11, "Oppo");
        brandDAO.addbrand(b);

        // Update brand
//        b = brandDAO.getBrandById(2);
//        b.setName("Samsung");

    }
}
