package com.customer.Customer.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.Customer.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {


	Item findItemByItemno(Long itemno);

}
