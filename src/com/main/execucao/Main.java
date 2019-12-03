package com.main.execucao;

import java.util.Scanner;

import com.opercoes.comuns.Preencher;
import com.programa.ordenacao.BubbleSort;
import com.programa.ordenacao.InsertionSort;
import com.programa.ordenacao.QuickSort;
import com.programa.ordenacao.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		int array[] = new int[1000000];
		
		Preencher preencher = new Preencher();
		
		
		//preencher.aleatorio(array, 50000);
		
		preencher.decrescente(array);
		
		//preencher.crescente(array);
		
		SelectionSort selectionSort = new SelectionSort();
		
		selectionSort.operador(array);
		
		//BubbleSort bubblesort = new BubbleSort();
		
		//bubblesort.operador(array);
		
		//InsertionSort insertionSort = new InsertionSort();
		
		//insertionSort.operador(array);
		
		
		// quick sort
		/*
		QuickSort quickSort = new QuickSort();
		
		long start = System.currentTimeMillis();
		
		quickSort.operador(array, 0, array.length -1);
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Ordena��o finalizada.\n Tempo de: " 
				+ elapsed + "ms Compara��es: " + quickSort.quantidadeIfs + " Movimenta��es: " +quickSort.movimentacoes);
		*/
		// quick sort
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		
	}

	

}
