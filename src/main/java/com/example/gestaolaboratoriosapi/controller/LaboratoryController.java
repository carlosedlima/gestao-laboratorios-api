package com.example.gestaolaboratoriosapi.controller;


import com.example.gestaolaboratoriosapi.dto.LaboratoryDTO;
import com.example.gestaolaboratoriosapi.entity.Laboratory;
import com.example.gestaolaboratoriosapi.service.ILaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/laboratory")
public class LaboratoryController {
    private final ILaboratoryService laboratoryService;

    @Autowired
    public LaboratoryController(ILaboratoryService laboratoryService) {
        this.laboratoryService = laboratoryService;
    }

    @PostMapping
    public ResponseEntity<Laboratory> createLaboratory(@RequestBody Laboratory laboratory) {
        Laboratory savedLaboratory = laboratoryService.save(laboratory);
        return new ResponseEntity<>(savedLaboratory, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LaboratoryDTO> getLaboratory(@PathVariable Long id) {
        LaboratoryDTO laboratoryDTO = laboratoryService.getLaboratory(id);
        if (laboratoryDTO != null) {
            return new ResponseEntity<>(laboratoryDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLaboratory(@PathVariable Long id) {
        String response = laboratoryService.remove(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
