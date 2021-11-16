package com.esdo.bepilot.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "mission")
@AllArgsConstructor
@NoArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String missionKey;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String communication;

    @Column(columnDefinition = "VARCHAR(100)")
    private String missionType;

    @Column(columnDefinition = "int default 0")
    private Integer quantity;

    @Column(columnDefinition = "int default 0")
    private Integer quantityMade;

    @Column(columnDefinition = "VARCHAR(100)")
    private String keyWord;

    @Column(columnDefinition = "VARCHAR(100)")
    private String link;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal priceUnit;

    @Column(columnDefinition = "Text(20)")
    private BigDecimal moneyReceived;

    @CreatedDate
    @Column(columnDefinition = "timestamp default now()")
    private Date createAt;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(columnDefinition = "timestamp default now()")
    private Date updateAt;

    @Column(columnDefinition = "VARCHAR(100)")
    private String deadTime;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer ;

    @OneToMany(mappedBy = "mission")
    private List<MissionDetail> missionDetails = new ArrayList<>() ;

}
