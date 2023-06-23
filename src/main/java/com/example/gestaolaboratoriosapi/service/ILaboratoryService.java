package com.example.gestaolaboratoriosapi.service;

import com.example.gestaolaboratoriosapi.dto.LaboratoryDTO;
import com.example.gestaolaboratoriosapi.entity.Laboratory;

import java.util.ArrayList;

public interface ILaboratoryService {

    Laboratory save(Laboratory dto);

    LaboratoryDTO getLaboratory(Integer id);

    String remove(Integer id);

    ArrayList<LaboratoryDTO> getAllLaboratorys();

}
