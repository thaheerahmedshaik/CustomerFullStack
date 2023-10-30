package com.customer.Customer.Repository.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Customer.Repository.ItemRepository;
import com.customer.Customer.model.Item;

@Service
public class ItemService {

	
	public ItemRepository itemRepository;
	
	@Autowired
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository=itemRepository;
	}
	

	public Item findItemByitemno(Long itemno) {
		return itemRepository.findItemByItemno(itemno);
	}
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	
	
	
	public Item updateItem(Item item) {
		return itemRepository.save(item);
	}
	
	public void deleteItem(Long itemno) {
		itemRepository.deleteById(itemno);
	}

	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	
	public List<Item> getDiscountedProducts(){
		itemRepository.applyDiscountToProducts();
		List<Item> discountedProducts = itemRepository.findByItemcostGreaterThan(150);
        return discountedProducts;
	
		
	}
}
