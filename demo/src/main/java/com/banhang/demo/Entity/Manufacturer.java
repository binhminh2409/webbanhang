package com.banhang.demo.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

}
