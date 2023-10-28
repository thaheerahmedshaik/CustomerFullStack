package com.customer.Customer.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Customer.Repository.Service.ItemService;
import com.customer.Customer.model.Item;

@RestController
@RequestMapping("/item")
public class ItemController {

	
	public ItemService itemService;
	
	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService=itemService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Item>> getAllitems(){
		List<Item> items=itemService.findAll();
		return new ResponseEntity<>(items,HttpStatus.OK);
	}
	
   @PostMapping("/add")
   public ResponseEntity<Item> addItem(@RequestBody Item item){
	   Item additem=itemService.addItem(item);
	   return new ResponseEntity<>(additem,HttpStatus.CREATED);
   }
   
   @PutMapping("/update")
   public ResponseEntity<Item> updateItem(@RequestBody Item item){
	   Item updateitem=itemService.updateItem(item);
	   return new ResponseEntity<>(updateitem,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{itemno}")
   public ResponseEntity<?> deleteItem(@PathVariable("itemno") Long itemno){
	   itemService.deleteItem(itemno);
	   return new ResponseEntity<>(HttpStatus.OK);
   }
   @GetMapping("/find/{itemno}")
   public ResponseEntity<Item> findItemByitemno(@PathVariable("itemno") Long itemno){
	   Item item=itemService.findItemByitemno(itemno);
	   return new ResponseEntity<>(item,HttpStatus.OK);
   }

}
