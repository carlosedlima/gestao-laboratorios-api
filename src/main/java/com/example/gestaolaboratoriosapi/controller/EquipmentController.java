package com.example.gestaolaboratoriosapi.controller;

import com.example.gestaolaboratoriosapi.dto.EquipmentDTO;
import com.example.gestaolaboratoriosapi.entity.Equipment;
import com.example.gestaolaboratoriosapi.service.IEquipmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipments")
public class EquipmentController {

    private IEquipmentService equipmentService;

    public EquipmentController(IEquipmentService equipmentService) {this.equipmentService = equipmentService;}

    @PostMapping
    public String saveEquipment(@RequestBody EquipmentDTO dto){
        Equipment equipment = equipmentService.save(dto.toEntity());
        return "Equipamento Salvo";
    }
}
