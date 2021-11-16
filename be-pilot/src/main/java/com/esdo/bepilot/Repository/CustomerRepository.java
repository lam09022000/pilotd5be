package com.esdo.bepilot.Repository;

import com.esdo.bepilot.Model.Entity.Customer;
import com.esdo.bepilot.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE Customer c SET c.name = ?2, c.phone = ?3 where c.id = ?1 ")
    void saveCustomer(Long id, String name ,String phone) ;

    @Query(value = "SELECT * from Customer c ORDER BY c.id DESC limit 1", nativeQuery = true)
    List<Customer> getCustomerClone() ;
}
