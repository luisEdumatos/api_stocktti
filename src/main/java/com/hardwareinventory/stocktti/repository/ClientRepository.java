package com.hardwareinventory.stocktti.repository;

import com.hardwareinventory.stocktti.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
