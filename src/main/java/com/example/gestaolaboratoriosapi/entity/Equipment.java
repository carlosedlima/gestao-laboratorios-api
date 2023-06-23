package com.example.gestaolaboratoriosapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "equipamento")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String equipment;

    private String description;


    public Equipment(Long id, String equipment, String description) {
        this.id = id;
        this.equipment = equipment;
        this.description = description;
    }

    public Equipment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
