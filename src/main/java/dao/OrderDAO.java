package dao;

import database.Connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.math.BigDecimal;

public class OrderDAO {
    private EntityManager entityManager;

    public OrderDAO() {
        entityManager = Connection.getInstance().getEntityManagerFactory().createEntityManager();
    }

    //Tính tổng tiền của đơn hàng khi biết mã số đơn hàng
    public double getTotalOrderById(int id) {

        EntityTransaction tr = entityManager.getTransaction();
        double total = 0;
        try {
            tr.begin();
            String sql = "select sum((1-oi.discount)*oi.quantity*oi.list_price)\r\n" +
                    "from order_items oi join orders o on o.order_id=oi.order_id\r\n" +
                    "where o.order_id = "+id+" ";
            Object obj = entityManager.createNativeQuery(sql).getSingleResult();
            BigDecimal b = (BigDecimal) obj;
            double money = b.doubleValue();

            tr.commit();
            return money;
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
        return total;
    }
}
