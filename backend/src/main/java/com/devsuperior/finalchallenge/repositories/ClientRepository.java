package com.devsuperior.finalchallenge.repositories;

import com.devsuperior.finalchallenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
