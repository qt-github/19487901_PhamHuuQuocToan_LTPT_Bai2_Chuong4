package app;

import dao.BrandDAO;
import dao.OrderDAO;
import dao.ProductDAO;
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
//        try {
//            tr.begin();
//
//            tr.commit();
//        }catch (Exception e){
//            tr.rollback();
//            e.printStackTrace();
//        }
        //Câu C.1
        BrandDAO brandDAO = new BrandDAO();
        // Get brand by id
//        Brand b = brandDAO.getBrandById(9);
//        System.out.println(b);

        // Get all brands
//        brandDAO.getAllBrands().forEach(System.out::println);

        // Add new brand
//        Brand b = new Brand();
//        b.setName("Apple");
//        brandDAO.addbrand(b);

        // Update brand
//        Brand b = brandDAO.getBrandById(2);
//        b.setName("Samsung");
//        System.out.println(b);

        //2 câu bất kỳ trong mục C

        //C.5 Tính tổng tiền của đơn hàng khi biết mã số đơn hàng
//        OrderDAO orderDAO = new OrderDAO();
//        System.out.println(orderDAO.getTotalOrderById(1));

        //C.2 Tìm danh sách sản phẩm có giá cao nhất
//        ProductDAO productDAO = new ProductDAO();
//        productDAO.findProductWithMaxPrice();

    }
}
