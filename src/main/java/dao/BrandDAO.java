package dao;

import database.Connection;
import entities.Brand;
import jakarta.persistence.EntityManager;

import java.util.List;

public class BrandDAO {
    private EntityManager entityManager;

    public BrandDAO() {
        entityManager = Connection.getInstance().getEntityManagerFactory().createEntityManager();
    }

    //add new brand
    public boolean addbrand(Brand brand) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(brand);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    public boolean updateBrand(Brand brand) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(brand);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    public boolean deleteBrand(Brand brand) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(brand);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            return false;
        }
    }

    public Brand getBrandById(int id) {
        return entityManager.find(Brand.class, id);
    }

    public List<Brand> getAllBrands() {
        return entityManager.createQuery("SELECT b FROM Brand b", Brand.class).getResultList();
    }
}
