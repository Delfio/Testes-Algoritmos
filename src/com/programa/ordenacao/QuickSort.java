package com.programa.ordenacao;

public class QuickSort {
	public static int quantidadeIfs = 0;
	public static int movimentacoes = 0;
	public static long start;
	
	public static void operador(int[] array, int esq, int dir) {
		start = System.currentTimeMillis();

		
		if(esq < dir) {
			quantidadeIfs ++;
			int j = separar(array, esq, dir);
			operador(array, esq, j-1);
			operador(array, j+1, dir);
		}

		
	}

	private static int separar(int[] array, int esq, int dir) {
		
		int i = esq+1;
		int j = dir;
		int pivo = array[esq];
		
		while(i <= j){
			movimentacoes ++;
			if(array[i] <= pivo) i++;
			else if (array[j] > pivo) j--;
			else if(i <= j) {
				trocar(array, i, j);
				i++;
				j--;
			}
		}
		trocar(array, esq, j);
		long elapsed = System.currentTimeMillis() - start;
		
		//System.out.println("Ordenação finalizada.\n Tempo de: " 
		//+ elapsed + "ms Comparações: " + quantidadeIfs + " Movimentações: " +movimentacoes);
		return j;
		

	}

	private static void trocar(int[] array, int i, int j) {
		
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
		

	}

}
