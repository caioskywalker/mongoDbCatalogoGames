package br.com.cfarias.mongoDb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.mongoDb.model.Jogo;
import br.com.cfarias.mongoDb.service.JogoService;

@RestController
@RequestMapping(path = "/jogos")
public class JogoController {

	@Autowired
	private JogoService jogoService;
	
	@PostMapping
	public Jogo criarJogo(@RequestBody Jogo jogo) {
		return jogoService.criarJogo(jogo);
	}
	@GetMapping(path = "/count")
	public long contaJogos() {
		return jogoService.count();
	}
}
