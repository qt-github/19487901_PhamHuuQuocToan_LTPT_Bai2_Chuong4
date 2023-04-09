package entities;

import jakarta.persistence.*;

@Entity
@IdClass(StockPK.class)
@Table(name = "stocks")
public class Stock {
    @Id
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    public Stock() {

    }
}
