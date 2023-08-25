package com.example.gestaolaboratoriosapi.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Defect {
    //Comentario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Equipment equipment;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Defect() {
    }

    public Defect(Long id, Equipment equipment, String description) {
        this.id = id;
        this.equipment = equipment;
        this.description = description;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}