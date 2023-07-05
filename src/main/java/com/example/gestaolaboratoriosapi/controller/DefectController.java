package com.example.gestaolaboratoriosapi.controller;

import com.example.gestaolaboratoriosapi.dto.DefectDTO;
import com.example.gestaolaboratoriosapi.service.IDefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/defect")
public class DefectController {
    private final IDefectService defectService;

    @Autowired
    public DefectController(IDefectService defectService) {
        this.defectService = defectService;
    }

    @PostMapping
    public ResponseEntity<DefectDTO> createDefect(@RequestBody DefectDTO defectDTO) {
        DefectDTO createdDefect = defectService.createDefect(defectDTO);
        return new ResponseEntity<>(createdDefect, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DefectDTO> getDefect(@PathVariable Long id) {
        DefectDTO defectDTO = defectService.getDefectById(id);
        if (defectDTO != null) {
            return new ResponseEntity<>(defectDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<DefectDTO>> getAllDefects() {
        List<DefectDTO> defectDTOs = defectService.getAllDefects();
        return new ResponseEntity<>(defectDTOs, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDefect(@PathVariable Long id) {
        String response = defectService.deleteDefect(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}