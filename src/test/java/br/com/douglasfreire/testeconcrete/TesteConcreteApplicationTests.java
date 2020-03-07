package br.com.douglasfreire.testeconcrete;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import br.com.douglasfreire.testeconcrete.controller.CadastroController;

@WebMvcTest(controllers = CadastroController.class)
class TesteConcreteApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Before(value = "")
	public void setup() {

	}

	@Test
	void testeCadastro() throws Exception {
		this.mockMvc
		.perform(get("/cadastro"))
		.andExpect(status().isOk())
		.andExpect(content().string("Cadastro1 de usuários"));
	}

}
