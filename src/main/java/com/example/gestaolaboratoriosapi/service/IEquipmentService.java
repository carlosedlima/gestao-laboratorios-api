package com.example.gestaolaboratoriosapi.service;



import com.example.gestaolaboratoriosapi.dto.EquipmentDTO;
import com.example.gestaolaboratoriosapi.entity.Equipment;

import java.util.ArrayList;

public interface IEquipmentService {

    Equipment save(Equipment dto);

    EquipmentDTO getEquipment(Integer id);

    String remove(Integer id);

    ArrayList<EquipmentDTO> getAllEquipment();

}
