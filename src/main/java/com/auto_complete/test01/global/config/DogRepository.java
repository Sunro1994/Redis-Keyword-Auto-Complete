package com.auto_complete.test01.global.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog,Long> {

    @Query("select d.name from Dog d")
    List<String> findAllDogNames();
}
