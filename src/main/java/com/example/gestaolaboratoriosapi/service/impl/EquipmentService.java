package com.example.gestaolaboratoriosapi.service.impl;

import com.example.gestaolaboratoriosapi.dto.EquipmentDTO;
import com.example.gestaolaboratoriosapi.entity.Equipment;
import com.example.gestaolaboratoriosapi.repository.EquipmentRepository;
import com.example.gestaolaboratoriosapi.service.IEquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentService implements IEquipmentService {

    private final EquipmentRepository equipmentRepository;

    @Override
    public Equipment save(Equipment dto) {
        Equipment equipment = new Equipment();
        equipment.setEquipment(dto.getEquipment());
        equipment.setDescription(dto.getDescription());

        return equipmentRepository.save(equipment);
    }

    @Override
    public EquipmentDTO getEquipment(Long id) {
        Equipment equipment = equipmentRepository.findById(id).orElse(null);
        if (equipment != null) {
            EquipmentDTO equipmentDTO = new EquipmentDTO();
            equipmentDTO.setId(equipment.getId());
            equipmentDTO.setEquipment(equipment.getEquipment());
            equipmentDTO.setDescription(equipment.getDescription());
            return equipmentDTO;
        }
        return null;
    }

    @Override
    public String remove(Long id) {
        equipmentRepository.deleteById(id);
        return "Equipment with ID " + id + " has been removed.";
    }

    @Override
    public ArrayList<EquipmentDTO> getAllEquipment() {
        List<Equipment> equipmentList = equipmentRepository.findAll();
        ArrayList<EquipmentDTO> equipmentDTOList = new ArrayList<>();

        for (Equipment equipment : equipmentList) {
            EquipmentDTO equipmentDTO = new EquipmentDTO();
            equipmentDTO.setId(equipment.getId());
            equipmentDTO.setEquipment(equipment.getEquipment());
            equipmentDTO.setDescription(equipment.getDescription());
            equipmentDTOList.add(equipmentDTO);
        }

        return equipmentDTOList;
    }
}
