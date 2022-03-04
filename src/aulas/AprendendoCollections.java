package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AprendendoCollections {
	public static void main(String[] args) {
		List<Aula> aulas = new ArrayList<>();
		Aula aula1 = new Aula("estudando Collections",15.45);
		Aula aula2 = new Aula("aprendendo cada vez mais",17.50);
		Aula aula3 = new Aula("o esforço vale apena",21.77);
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		Collections.sort(aulas);
		System.err.println(aulas);
		
		Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
		
		System.err.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.err.println(aulas);
		
	}
}
