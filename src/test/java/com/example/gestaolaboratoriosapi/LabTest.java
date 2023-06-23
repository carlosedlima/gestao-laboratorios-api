package com.example.gestaolaboratoriosapi;

import com.example.gestaolaboratoriosapi.entity.Laboratory;
import org.junit.jupiter.api.Test;

public class LabTest {

        Laboratory laboratory;

        @Test
        public  void criarLab(){
            laboratory = new Laboratory();

            laboratory.setLaboratoryName("Lab test");

        }

}
