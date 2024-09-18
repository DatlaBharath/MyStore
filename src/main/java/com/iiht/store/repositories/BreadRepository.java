package com.iiht.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.store.model.Bread;

public interface BreadRepository extends JpaRepository<Bread, Long>{

}
