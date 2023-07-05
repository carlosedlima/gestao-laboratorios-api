package com.example.gestaolaboratoriosapi.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String laboratoryName;


    public Laboratory(Long id, String laboratoryName) {
        this.id = id;
        this.laboratoryName = laboratoryName;
    }

    public Laboratory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLaboratoryName() {
        return laboratoryName;
    }

    public void setLaboratoryName(String laboratoryName) {
        this.laboratoryName = laboratoryName;
    }
}
