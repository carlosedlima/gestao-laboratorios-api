package com.example.gestaolaboratoriosapi.repository;


import com.example.gestaolaboratoriosapi.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {

}
