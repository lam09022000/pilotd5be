package com.esdo.bepilot.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String customerKey;

    @Column
    private Long idAccount ;

    @Column(columnDefinition = "VARCHAR(100)")
    private String avatar;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(columnDefinition = "VARCHAR(100)")
    private String password;

    @Column(columnDefinition = "VARCHAR(100)")
    private String phone;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal money;

    @Column(columnDefinition = "Text(20)")
    private String companyName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer" )
    private List<TransactionOfCustomer> transaction = new ArrayList<>();

    @OneToMany( mappedBy = "customer")
    private List<Mission> missions = new ArrayList<>();

}
