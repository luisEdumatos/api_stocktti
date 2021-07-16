package com.hardwareinventory.stocktti;

import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.enums.DeviceStatusCondition;
import com.hardwareinventory.stocktti.enums.DeviceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class StockttiApplication {

	public static void main(String[] args) {

		SpringApplication.run(StockttiApplication.class, args);

	}

}
