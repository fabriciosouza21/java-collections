package Aulas;

import java.util.Objects;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private double tempo;
	
	public Aula(String titulo, double tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s",titulo, tempo);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(tempo, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Double.doubleToLongBits(tempo) == Double.doubleToLongBits(other.tempo)
				&& Objects.equals(titulo, other.titulo);
	}
	@Override
	public int compareTo(Aula outraAula) {		
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
