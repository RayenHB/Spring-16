package com.rayen.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rayen.demo.entities.RocketType;


@RepositoryRestResource(path = "type")
@CrossOrigin("http://localhost:4200/")
public interface TypeRepository extends JpaRepository<RocketType, Long> {

}