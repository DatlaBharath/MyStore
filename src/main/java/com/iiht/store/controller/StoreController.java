package com.iiht.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.store.model.Apple;
import com.iiht.store.model.Bread;
import com.iiht.store.model.Choclates;
import com.iiht.store.model.Egg;
import com.iiht.store.model.Milk;
import com.iiht.store.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	// GET
	
	@GetMapping("/egg/{id}")
	public ResponseEntity<Egg> getE(@PathVariable Long id){
		Optional<Egg> egg = storeService.fetchEggById(id);
		if (egg.isPresent()) {
			return ResponseEntity.ok(egg.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@GetMapping("/milk/{id}")
	public ResponseEntity<Milk> getM(@PathVariable Long id){
		Optional<Milk> milk = storeService.fetchMilkById(id);
		if (milk.isPresent()) {
			return ResponseEntity.ok(milk.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	@GetMapping("/bread/{id}")
	public ResponseEntity<Bread> getB(@PathVariable Long id){
		Optional<Bread> bread = storeService.fetchBreadById(id);
		if (bread.isPresent()) {
			return ResponseEntity.ok(bread.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@GetMapping("/choclates/{id}")
	public ResponseEntity<Choclates> getC(@PathVariable Long id){
		Optional<Choclates> choclates = storeService.fetchChoclateById(id);
		if (choclates.isPresent()) {
			return ResponseEntity.ok(choclates.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	@GetMapping("/apple/{id}")
	public ResponseEntity<Apple> getA(@PathVariable Long id){
		Optional<Apple> apple = storeService.fetchAppleById(id);
		if (apple.isPresent()) {
			return ResponseEntity.ok(apple.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@GetMapping("/apple")
	public ResponseEntity<List<Apple>> getAA(){
		return ResponseEntity.ok(storeService.fetchallApple());
	}
	@GetMapping("/egg")
	public ResponseEntity<List<Egg>> getAE(){
		return ResponseEntity.ok(storeService.fetchallEgg());
	}
	@GetMapping("/milk")
	public ResponseEntity<List<Milk>> getAM(){
		return ResponseEntity.ok(storeService.fetchallMilk());
	}
	@GetMapping("/choclates")
	public ResponseEntity<List<Choclates>> getAC(){
		return ResponseEntity.ok(storeService.fetchallChoclates());
	}
	@GetMapping("/bread")
	public ResponseEntity<List<Bread>> getAB(){
		return ResponseEntity.ok(storeService.fetchallBread());
	}
	// POST
	@PostMapping(path="/apple",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Apple> postA(@RequestBody Apple apple){
		Optional<Apple> app = storeService.fetchAppleById(apple.getAppleId());
		if(app.isPresent()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(storeService.saveApple(apple));
		}
	}
	
	@PostMapping(path="/milk",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Milk> postM(@RequestBody Milk milk){
		Optional<Milk> mil = storeService.fetchMilkById(milk.getMilkId());
		if(mil.isPresent()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(storeService.saveMilk(milk));
		}
	}
	
	@PostMapping(path="/egg",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Egg> postE(@RequestBody Egg egg){
		Optional<Apple> eg = storeService.fetchAppleById(egg.getEggId());
		if(eg.isPresent()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(storeService.saveEgg(egg));
		}
	}
	
	@PostMapping(path="/bread",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bread> postB(@RequestBody Bread bread){
		Optional<Bread> bre = storeService.fetchBreadById(bread.getBreadId());
		if(bre.isPresent()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(storeService.saveBread(bread));
		}
	}
	
	@PostMapping(path="/choclates",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Choclates> postC(@RequestBody Choclates choclates){
		Optional<Choclates> cho = storeService.fetchChoclateById(choclates.getChoclateId());
		if(cho.isPresent()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(storeService.saveChoclates(choclates));
		}
	}
	
	// PUT
	@PutMapping(path="/apple2",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Apple> putA(@RequestBody Apple apple){
		Optional<Apple> app = storeService.fetchAppleById(apple.getAppleId());
		if(app.isPresent()) {
			return ResponseEntity.ok(storeService.saveApple(apple));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping(path="/milk2",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Milk> putM(@RequestBody Milk milk){
		Optional<Milk> mil = storeService.fetchMilkById(milk.getMilkId());
		if(mil.isPresent()) {
			return ResponseEntity.ok(storeService.saveMilk(milk));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping(path="/egg2",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Egg> putE(@RequestBody Egg egg){
		Optional<Apple> eg = storeService.fetchAppleById(egg.getEggId());
		if(eg.isPresent()) {
			return ResponseEntity.ok(storeService.saveEgg(egg));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping(path="/bread2",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bread> putB(@RequestBody Bread bread){
		Optional<Bread> bre = storeService.fetchBreadById(bread.getBreadId());
		if(bre.isPresent()) {
			return ResponseEntity.ok(storeService.saveBread(bread));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping(path="/choclates2",consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Choclates> putC(@RequestBody Choclates choclates){
		Optional<Choclates> cho = storeService.fetchChoclateById(choclates.getChoclateId());
		if(cho.isPresent()) {
			return ResponseEntity.ok(storeService.saveChoclates(choclates));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	// DELETE
	@DeleteMapping("/degg/{id}")
	public ResponseEntity<Egg> delE(@PathVariable Long id){
		Optional<Egg> egg = storeService.fetchEggById(id);
		if (egg.isPresent()) {
			storeService.deleteEggById(id);
			return ResponseEntity.ok(egg.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/dmilk/{id}")
	public ResponseEntity<Milk> delM(@PathVariable Long id){
		Optional<Milk> milk = storeService.fetchMilkById(id);
		if (milk.isPresent()) {
			storeService.deleteMilkById(id);
			return ResponseEntity.ok(milk.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	@DeleteMapping("/dbread/{id}")
	public ResponseEntity<Bread> delB(@PathVariable Long id){
		Optional<Bread> bread = storeService.fetchBreadById(id);
		if (bread.isPresent()) {
			storeService.deleteBreadById(id);
			return ResponseEntity.ok(bread.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@DeleteMapping("/dchoclates/{id}")
	public ResponseEntity<Choclates> delC(@PathVariable Long id){
		Optional<Choclates> choclates = storeService.fetchChoclateById(id);
		if (choclates.isPresent()) {
			storeService.deleteChoclatesById(id);
			return ResponseEntity.ok(choclates.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@DeleteMapping("/dapple/{id}")
	public ResponseEntity<Apple> delA(@PathVariable Long id){
		Optional<Apple> apple = storeService.fetchAppleById(id);
		if (apple.isPresent()) {
			storeService.deleteAppleById(id);
			return ResponseEntity.ok(apple.get());
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
}
