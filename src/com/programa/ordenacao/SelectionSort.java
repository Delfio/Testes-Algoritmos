package com.programa.ordenacao;

import com.opercoes.comuns.Trocar;

public class SelectionSort {
	
	Trocar trocar = new Trocar();

	public static void operador(int[] array) {
		long start = System.currentTimeMillis();
		int quantidadeIfs = 0;
		int movimentacoes = 0;
		
		for (int i = 0; i < array.length; i++) {
			movimentacoes ++;
			int menor = i;
			for (int j = i + 1; j < array.length; j++) {
				movimentacoes ++;
				if(array[j] < array[menor]) {
					quantidadeIfs++;
					menor = j;
				}
			}
			Trocar.trocar(array, i, menor);
		}
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Ordenação finalizada.\n Tempo de: " 
		+ elapsed + "ms Comparações: " + quantidadeIfs + " Movimentações: " +movimentacoes);
	}
	
}
