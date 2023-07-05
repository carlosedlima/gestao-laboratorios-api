package com.example.gestaolaboratoriosapi.controller;

import com.example.gestaolaboratoriosapi.dto.EquipmentDTO;
import com.example.gestaolaboratoriosapi.entity.Equipment;
import com.example.gestaolaboratoriosapi.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    private final IEquipmentService equipmentService;

    @Autowired
    public EquipmentController(IEquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment equipment) {
        Equipment savedEquipment = equipmentService.save(equipment);
        return new ResponseEntity<>(savedEquipment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipmentDTO> getEquipment(@PathVariable Long id) {
        EquipmentDTO equipmentDTO = equipmentService.getEquipment(id);
        if (equipmentDTO != null) {
            return new ResponseEntity<>(equipmentDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEquipment(@PathVariable Long id) {
        String response = equipmentService.remove(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
