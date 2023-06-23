package com.example.gestaolaboratoriosapi.controller;


import com.example.gestaolaboratoriosapi.dto.LaboratoryDTO;
import com.example.gestaolaboratoriosapi.entity.Laboratory;
import com.example.gestaolaboratoriosapi.service.ILaboratoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/laboratory")
public class LaboratoryController {

    private ILaboratoryService laboratoryService;

    public LaboratoryController(ILaboratoryService laboratoryService) {
        this.laboratoryService = laboratoryService;
    }

    @PostMapping
    public String saveLaboratory(@RequestBody LaboratoryDTO dto){
        Laboratory laboratory = laboratoryService.save(dto.toEntity());
        return "Laboratorio salvo";
    }

    @GetMapping
    public ArrayList<LaboratoryDTO> getAllLaboratory(){
        ArrayList<LaboratoryDTO> laboratories = laboratoryService.getAllLaboratorys();
        return laboratories;
    }
}
