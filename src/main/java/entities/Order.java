package entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;
    @Column(name = "order_status")
    private short orderStatus;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "required_date")
    private Date requiredDate;
    @Column(name = "shipped_date")
    private Date shippedDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order(int id, short orderStatus, Date orderDate, Date requiredDate, Date shippedDate) {
        super();
        this.id = id;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + ", requiredDate="
                + requiredDate + ", shippedDate=" + shippedDate + "]";
    }

}
