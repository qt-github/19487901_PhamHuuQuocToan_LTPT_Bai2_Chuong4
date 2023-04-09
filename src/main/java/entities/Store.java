package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private int id;

    @Column(name = "store_name")
    private String name;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    @Column(name = "zip_code")
    private String zipcode;

    @OneToMany(mappedBy = "store")
    private List<Staff> staffs;

    @OneToMany(mappedBy = "store")
    private List<Stock> stocks;

    public Store() {
    }
}
