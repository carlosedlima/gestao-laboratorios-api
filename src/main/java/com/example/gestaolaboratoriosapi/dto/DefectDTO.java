package com.example.gestaolaboratoriosapi.dto;

import com.example.gestaolaboratoriosapi.entity.Defect;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DefectDTO {
    private Long id;
    private EquipmentDTO equipment;
    private String description;

    public Defect toEntity() {
        return new Defect(id, equipment.toEntity(), description);
    }

    public static DefectDTO fromEntity(Defect defect) {
        EquipmentDTO equipmentDTO = EquipmentDTO.fromEntity(defect.getEquipment());

        return DefectDTO.builder()
                .equipment(equipmentDTO)
                .description(defect.getDescription())
                .build();
    }
}