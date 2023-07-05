package com.example.gestaolaboratoriosapi.service.impl;

import com.example.gestaolaboratoriosapi.dto.DefectDTO;
import com.example.gestaolaboratoriosapi.entity.Defect;
import com.example.gestaolaboratoriosapi.repository.DefectRepository;
import com.example.gestaolaboratoriosapi.service.IDefectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DefectService implements IDefectService {
    private final DefectRepository defectRepository;

    @Override
    public DefectDTO createDefect(DefectDTO defectDTO) {
        Defect defect = defectDTO.toEntity();
        Defect savedDefect = defectRepository.save(defect);
        return DefectDTO.fromEntity(savedDefect);
    }

    @Override
    public DefectDTO getDefectById(Long id) {
        Optional<Defect> defectOptional = defectRepository.findById(id);
        return defectOptional.map(DefectDTO::fromEntity).orElse(null);
    }

    @Override
    public String deleteDefect(Long id) {
        defectRepository.deleteById(id);
        return "Defect with ID " + id + " has been deleted.";
    }

    @Override
    public List<DefectDTO> getAllDefects() {
        List<Defect> defects = defectRepository.findAll();
        return defects.stream()
                .map(DefectDTO::fromEntity)
                .collect(Collectors.toList());
    }
}