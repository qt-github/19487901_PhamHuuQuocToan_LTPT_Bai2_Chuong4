package database;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private static Connection instance;
    private EntityManagerFactory entityManagerFactory;

    private Connection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("19487901_PhamHuuQuocToan");
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance =  new Connection();
        }
        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
