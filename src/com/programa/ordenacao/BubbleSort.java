package com.programa.ordenacao;


public class BubbleSort {
	
	public static void operador(int[] array) {
		
		long start = System.currentTimeMillis();
		int quantidadeIfs = 0;
		int movimentacoes = 0;
		
		int aux;
		
		for (int i = 0; i < array.length; i++) {
			movimentacoes ++;
			for (int j = 0; j < array.length - 1; j++) {
				movimentacoes ++;
				
				if(array[j] > array[j + 1] ) {
					quantidadeIfs ++;
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
				
			}

			
		}
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Ordenação finalizada.\n Tempo de: " 
				+ elapsed + "ms Comparações: " + quantidadeIfs + " Movimentações: " +movimentacoes);
	}
}
