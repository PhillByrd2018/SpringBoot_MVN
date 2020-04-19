package com.byrd.test.practice.repository;

import com.byrd.test.practice.model.CanGank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GankRepo extends JpaRepository<CanGank, Integer> {


}