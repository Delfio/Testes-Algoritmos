package com.programa.ordenacao;

public class InsertionSort {

	public static void operador(int[] array) {
		long start = System.currentTimeMillis();
		int quantidadeIfs = 0;
		int movimentacoes = 0;
		
		int x, j;
		
		for (int i = 1; i < array.length; i++) {
			movimentacoes++;
			x = array[i];
			j = i -1;
			
			while((j >= 0)&& array[j] > x) {
				quantidadeIfs ++;
				array[j+1] = array[j];
				j -= 1;
			}
			
			array[j+1] = x;
		}
		
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Ordenação finalizada.\n Tempo de: " 
		+ elapsed + "ms Comparações: " + quantidadeIfs + " Movimentações: " +movimentacoes);
		
	}
	
}
