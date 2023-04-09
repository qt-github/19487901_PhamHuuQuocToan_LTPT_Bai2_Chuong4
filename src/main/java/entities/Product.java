package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;
    @Column(name="product_name", nullable = false)
    private String name;
    @Column(name="model_year", columnDefinition = "smallint", precision = 2)
    private int modelYear;
    @Column(name="list_price", columnDefinition = "decimal(10,2)", precision = 2)
    private double price;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Stock> stocks;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Product() {
    }

    public Product(int id, String name, int modelYear, double price) {
        super();
        this.id = id;
        this.name = name;
        this.modelYear = modelYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", modelYear=" + modelYear + ", price=" + price + "]";
    }
}
