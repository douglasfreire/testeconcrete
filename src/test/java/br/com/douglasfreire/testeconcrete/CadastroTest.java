package br.com.douglasfreire.testeconcrete;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import br.com.douglasfreire.testeconcrete.controller.CadastroController;
import br.com.douglasfreire.testeconcrete.entities.Cadastro;
import br.com.douglasfreire.testeconcrete.services.CadastroService;

@RunWith(SpringRunner.class)@WebMvcTest(controllers = CadastroController.class)
public class CadastroTest {
	
	@Autowired
	private MockMvc mock;

	@MockBean
	private CadastroService cadastroService;
	
	@Test
	public void createNewCadastro() throws Exception {
		Cadastro mockCadastro = new Cadastro("Douglas", "douglas@email.com", "douglas1234", "99999-9999", "81" );
		
		when(cadastroService.create(any(Cadastro.class))).thenReturn(mockCadastro);
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String mockCadastroJSON = ow.writeValueAsString(mockCadastro);
		
		mock.perform(post("/cadastro")
				.contentType(APPLICATION_JSON_UTF8)
				.accept(APPLICATION_JSON_UTF8)
				.content(mockCadastroJSON))
		.andExpect(status().isOk())
		.andExpect(content().json(mockCadastroJSON));
	}

}
