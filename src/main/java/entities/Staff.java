package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="staffs")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="staff_id")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String email;
    private String phone;
    private byte active;

    @OneToMany(mappedBy = "manager")
    @Transient
    private List<Staff> staffs; //Manager

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Staff manager;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "staff")
    private List<Order> orders;

    public Staff() {
    }
}
