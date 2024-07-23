package br.com.cfarias.mongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Jogo")
public class Jogo {

	@Id
	private String id;
	
	private String nome;
	
	private String distribuidora;
	
	private String desenvolvedor;
	
	private String plataforma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Jogo(String nome, String distribuidora, String desenvolvedor, String plataforma) {
		super();
		this.nome = nome;
		this.distribuidora = distribuidora;
		this.desenvolvedor = desenvolvedor;
		this.plataforma = plataforma;
	}
	
	public Jogo() {
		
	}
	
}
