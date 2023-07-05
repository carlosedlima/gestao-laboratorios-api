package com.example.gestaolaboratoriosapi.repository;

import com.example.gestaolaboratoriosapi.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {

}