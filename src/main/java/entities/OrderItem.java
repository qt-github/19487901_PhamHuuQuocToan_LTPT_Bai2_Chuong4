package entities;

import jakarta.persistence.*;

@Entity
@IdClass(OrderItemPK.class)
@Table(name = "order_items")
public class OrderItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
    @Column(name = "list_price", columnDefinition = "decimal(10,2)", precision = 2)
    private double price;
    @Column(name = "discount", columnDefinition = "decimal(10,2)", precision = 2)
    private double discount;
    public OrderItem() {
        super();
    }
    public OrderItem(Order order, Product product, int quantity, double price, double discount) {
        super();
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "OrderItem [order=" + order + ", product=" + product + ", quantity=" + quantity + ", price=" + price
                + ", discount=" + discount + "]";
    }
}
