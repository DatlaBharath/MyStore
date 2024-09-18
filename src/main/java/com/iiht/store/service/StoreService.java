package com.iiht.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.store.model.Apple;
import com.iiht.store.model.Bread;
import com.iiht.store.model.Choclates;
import com.iiht.store.model.Egg;
import com.iiht.store.model.Milk;
import com.iiht.store.repositories.AppleRepository;
import com.iiht.store.repositories.BreadRepository;
import com.iiht.store.repositories.ChoclatesRepository;
import com.iiht.store.repositories.EggRepository;
import com.iiht.store.repositories.MilkRepository;

@Service
public class StoreService {
	@Autowired
	EggRepository eggRepository;
	
	@Autowired
	MilkRepository milkRepository;
	
	@Autowired
	ChoclatesRepository choclatesRepository;
	
	@Autowired
	BreadRepository breadRepository;
	
	@Autowired
	AppleRepository appleRepository;
	
	// Get by Id 
	public Optional<Egg> fetchEggById(Long id) {
		return eggRepository.findById(id);
	}
	public Optional<Milk> fetchMilkById(Long id) {
		return milkRepository.findById(id);
	}
	public Optional<Choclates> fetchChoclateById(Long id) {
		return choclatesRepository.findById(id);
	}
	public Optional<Apple> fetchAppleById(Long id) {
		return appleRepository.findById(id);
	}
	public Optional<Bread> fetchBreadById(Long id) {
		return breadRepository.findById(id);
	}
	
	// Get all
	public List<Egg> fetchallEgg(){
		return eggRepository.findAll();
	}
	public List<Milk> fetchallMilk(){
		return milkRepository.findAll();
	}
	public List<Choclates> fetchallChoclates(){
		return choclatesRepository.findAll();
	}
	public List<Apple> fetchallApple(){
		return appleRepository.findAll();
	}
	public List<Bread> fetchallBread(){
		return breadRepository.findAll();
	}
	
	// Create new
	
	public Egg saveEgg(Egg egg) {
		return eggRepository.save(egg);
	}
	public Milk saveMilk(Milk milk) {
		return milkRepository.save(milk);
	}
	public Choclates saveChoclates(Choclates choclates) {
		return choclatesRepository.save(choclates);
	}
	public Apple saveApple(Apple apple) {
		return appleRepository.save(apple);
	}
	public Bread saveBread(Bread bread) {
		return breadRepository.save(bread);
	}
	
	// Delete 
	
	public void deleteEggById(Long id) {
		eggRepository.deleteById(id);
	}
	public void deleteMilkById(Long id) {
		milkRepository.deleteById(id);
	}
	public void deleteChoclatesById(Long id) {
		choclatesRepository.deleteById(id);
	}
	public void deleteAppleById(Long id) {
		appleRepository.deleteById(id);
	}
	public void deleteBreadById(Long id) {
		breadRepository.deleteById(id);
	}
	
	
}
