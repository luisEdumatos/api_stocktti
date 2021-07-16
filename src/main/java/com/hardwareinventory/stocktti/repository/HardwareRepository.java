package com.hardwareinventory.stocktti.repository;

import com.hardwareinventory.stocktti.entity.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareRepository extends JpaRepository<Hardware, Long> {

}
