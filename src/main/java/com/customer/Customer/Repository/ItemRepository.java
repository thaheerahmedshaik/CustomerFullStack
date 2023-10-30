package com.customer.Customer.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.customer.Customer.model.Item;

import jakarta.transaction.Transactional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	List<Item> findByItemcostGreaterThan(double itemcost);

    @Transactional
    @Modifying
    @Query("UPDATE Item i SET i.itemcost  = i.itemcost  * 0.9 WHERE i.itemcost  > 150")
    void applyDiscountToProducts();
	
	

	Item findItemByItemno(Long itemno);

}
