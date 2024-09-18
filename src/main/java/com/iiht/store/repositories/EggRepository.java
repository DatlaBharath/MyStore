package com.iiht.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.store.model.Egg;

public interface EggRepository extends JpaRepository<Egg, Long>{

}
