package com.example.gestaolaboratoriosapi;

import com.example.gestaolaboratoriosapi.controller.LaboratoryController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = LaboratoryController.class)
class GestaoLaboratoriosApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public  void obterLab() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/laboratory"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
