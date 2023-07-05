package com.example.gestaolaboratoriosapi.service;

import com.example.gestaolaboratoriosapi.dto.DefectDTO;
import com.example.gestaolaboratoriosapi.entity.Defect;

import java.util.List;

public interface IDefectService {
    DefectDTO createDefect(DefectDTO defectDTO);
    DefectDTO getDefectById(Long id);
    String deleteDefect(Long id);
    List<DefectDTO> getAllDefects();
}