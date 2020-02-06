package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;



public class ItemServiceImpl implements ItemService {
private ItemRepository itemRepository;

@Autowired

public ItemServiceImpl(ItemRepository itemRepository) {
	super();
	this.itemRepository = itemRepository;
}


@Override
@Transactional
	public List<Item> getAllItem() {
		
		return itemRepository.findAll();
	}

	
	@Override
	@Transactional
	public Item createItem(Item item) {
		
		return itemRepository.insert(item);
	}

	
	
	
	
}
