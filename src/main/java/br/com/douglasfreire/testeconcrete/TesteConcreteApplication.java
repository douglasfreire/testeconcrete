package br.com.douglasfreire.testeconcrete;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import br.com.douglasfreire.testeconcrete.entity.Cadastro;
//import br.com.douglasfreire.testeconcrete.repositories.CadastroRepository;

@SpringBootApplication
public class TesteConcreteApplication {
	
//	@Autowired
//	private CadastroRepository cadastroRepository;

	public static void main(String[] args) {
		SpringApplication.run(TesteConcreteApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
		
//		Cadastro cadastro1 = new Cadastro("douglas", "douglas@email.com.br", "12345", "99999-9999", "81");
//		Cadastro cadastro2 = new Cadastro("joana", "joana@email.com.br", "12345678", "98888-8888", "81");
//		
//		cadastroRepository.save(cadastro1);
//		cadastroRepository.save(cadastro2);
//		
//		List<Cadastro> listaDeCadastro = cadastroRepository.findAll();
//		listaDeCadastro.forEach(cadastro -> System.out.println(cadastro));
		
//	}

}
