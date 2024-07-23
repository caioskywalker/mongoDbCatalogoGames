package br.com.cfarias.mongoDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import br.com.cfarias.mongoDb.model.Jogo;
import br.com.cfarias.mongoDb.repository.JogoRepository;

@Component
@EnableMongoRepositories(basePackageClasses = JogoRepository.class)
public class JogoService {

	@Autowired
	private JogoRepository jogoRepository;
	
	public Jogo criarJogo(Jogo jogo) {
		return jogoRepository.insert(jogo);
		
	}
	
	public long count() {
		return jogoRepository.count();
	}
}
