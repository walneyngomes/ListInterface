package Questao01;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AgendaEletronicaList {
	List<Contato> set;

	public AgendaEletronicaList() {
		this.set = new ArrayList<Contato>();

	}

	public void addContato(Contato c) {
		set.add(c);
	}

	public boolean removerContato(Contato c) {
		for (Contato con : set) {
			if (con.equals(c)) {
				set.remove(c);
				return true;
			}

		}

		return false;
	}

	public void removerContato(String id) {
		
		String[] palavras = id.split("");		
		set.removeIf(x -> x.getNome().substring(0,palavras.length) == id);
        for(Contato x: set){
        	System.out.print(x);
        }
		
	}

	public ArrayList<Contato> listarContato(String id) {
		ArrayList<Contato> lista = new ArrayList<Contato>();

		for (Contato c : set) {
			if (verificarPalavra(c.getNome(), id)) {
				lista.add(c);
			}

		}
		return lista;
	}

	private boolean verificarPalavra(String palavra, String id) {

		String[] palavras = id.split(" ");
		String palavraCortada = palavra.substring(0, palavras.length);

		if (id.equals(palavraCortada)) {
			return true;
		}
		return false;

	}

}



