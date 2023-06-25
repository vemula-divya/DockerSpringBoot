package com.springboot.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.docker.entity.DemoEntity;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity, Integer>{

}
