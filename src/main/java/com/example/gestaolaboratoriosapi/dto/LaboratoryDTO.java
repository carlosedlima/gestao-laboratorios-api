package com.example.gestaolaboratoriosapi.dto;


import com.example.gestaolaboratoriosapi.entity.Laboratory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LaboratoryDTO {
    private Long id;
    private String laboratoryName;

    public Laboratory toEntity() {
        return new Laboratory(id, laboratoryName);
    }

    public static LaboratoryDTO fromEntity(Laboratory laboratory) {
        return LaboratoryDTO.builder()
                .id(laboratory.getId())
                .laboratoryName(laboratory.getLaboratoryName())
                .build();
    }
}
