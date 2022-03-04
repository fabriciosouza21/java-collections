package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas  = new ArrayList<>();
	
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void adicionar (Aula aula) {
		this.aulas.add(aula);
	} 
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	
}
