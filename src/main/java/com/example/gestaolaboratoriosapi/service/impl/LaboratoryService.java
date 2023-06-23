package com.example.gestaolaboratoriosapi.service.impl;

import com.example.gestaolaboratoriosapi.dto.LaboratoryDTO;
import com.example.gestaolaboratoriosapi.entity.Laboratory;
import com.example.gestaolaboratoriosapi.repository.LaboratoryRepository;
import com.example.gestaolaboratoriosapi.service.ILaboratoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@RequiredArgsConstructor
public class LaboratoryService implements ILaboratoryService {

    private LaboratoryRepository laboratoryRepository;

    @Override
    public Laboratory save(Laboratory dto) {

        Laboratory laboratory = new Laboratory();

        laboratory.setLaboratoryName(dto.getLaboratoryName());
        return laboratoryRepository.save(laboratory);

    }

    @Override
    public LaboratoryDTO getLaboratory(Integer id) {
        return null;
    }

    @Override
    public String remove(Integer id) {
        return null;
    }

    @Override
    public ArrayList<LaboratoryDTO> getAllLaboratorys() {
        return null;
    }
}
