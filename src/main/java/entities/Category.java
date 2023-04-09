package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int id;
    @Column(name = "category_name")
    private String name;

    public Category() {
    }

    @OneToMany(mappedBy = "category")
    public List<Product> products;
}
