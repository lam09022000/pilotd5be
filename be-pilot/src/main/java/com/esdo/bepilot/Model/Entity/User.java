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
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String userKey;

    private String idAccount ;

    @Column(columnDefinition = "VARCHAR(100)")
    private String avatar;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(columnDefinition = "VARCHAR(100)")
    private String phone;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal amountMoneyReceive;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal moneyWithdrawn;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal moneyRemaining;

    @Column(columnDefinition = "Int(20)")
    private int numberOfMissionDone;

    @OneToMany(mappedBy = "user")
    private List<Withdrawn> withdrawnList = new ArrayList<>()  ;

    @OneToMany(fetch = FetchType.EAGER ,mappedBy = "user" , cascade = CascadeType.ALL)
    private List<MissionDetail> missionDetailList ;



}
