package br.com.cfarias.mongoDb.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.cfarias.mongoDb.model.Jogo;

public interface JogoRepository extends MongoRepository<Jogo, String>  {

	long count();
}
