package database;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private static Connection instance;
    private EntityManagerFactory entityManagerFactory;

    private Connection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Chapter4_Excercise2");
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
