package com.example.gestaolaboratoriosapi.service.impl;

import com.example.gestaolaboratoriosapi.dto.LaboratoryDTO;
import com.example.gestaolaboratoriosapi.entity.Laboratory;
import com.example.gestaolaboratoriosapi.repository.LaboratoryRepository;
import com.example.gestaolaboratoriosapi.service.ILaboratoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class LaboratoryService implements ILaboratoryService {

    private final LaboratoryRepository laboratoryRepository;

    @Override
    public Laboratory save(Laboratory dto) {
        Laboratory laboratory = new Laboratory();
        laboratory.setLaboratoryName(dto.getLaboratoryName());
        return laboratoryRepository.save(laboratory);
    }

    @Override
    public LaboratoryDTO getLaboratory(Long id) {
        Laboratory laboratory = laboratoryRepository.findById(id).orElse(null);
        if (laboratory != null) {
            LaboratoryDTO laboratoryDTO = new LaboratoryDTO();
            laboratoryDTO.setId(laboratory.getId());
            laboratoryDTO.setLaboratoryName(laboratory.getLaboratoryName());
            return laboratoryDTO;
        }
        return null;
    }

    @Override
    public String remove(Long id) {
        laboratoryRepository.deleteById(id);
        return "Laboratory with ID " + id + " has been removed.";
    }

    @Override
    public ArrayList<LaboratoryDTO> getAllLaboratorys() {
        List<Laboratory> laboratoryList = laboratoryRepository.findAll();
        ArrayList<LaboratoryDTO> laboratoryDTOList = new ArrayList<>();

        for (Laboratory laboratory : laboratoryList) {
            LaboratoryDTO laboratoryDTO = new LaboratoryDTO();
            laboratoryDTO.setId(laboratory.getId());
            laboratoryDTO.setLaboratoryName(laboratory.getLaboratoryName());
            laboratoryDTOList.add(laboratoryDTO);
        }

        return laboratoryDTOList;
    }
}
