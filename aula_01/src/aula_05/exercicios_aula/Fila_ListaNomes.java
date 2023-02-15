package aula_05.exercicios_aula;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila_ListaNomes {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elizangela");

		Iterator<String> iFila = fila.iterator();

		while (iFila.hasNext()) {
			System.out.println(iFila.next());
		}

		System.out.println("Retirar um elemento da fila");

		System.out.println("execução do método poll: " + fila.poll());

		System.out.println("chama a variavel fila: " + fila);

		System.out.println("execução do método peek: " + fila.peek());

		System.out.println("execução do método size: " + fila.size());

	}

}
