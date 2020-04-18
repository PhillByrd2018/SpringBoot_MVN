package com.byrd.test.practice.repository;
import com.byrd.test.practice.model.Mordekaiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MordRepo extends JpaRepository<Mordekaiser, Integer> {

}