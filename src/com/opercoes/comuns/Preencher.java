package com.opercoes.comuns;

import java.util.Random;

public class Preencher {
	public static int[] aleatorio(int[] array, int quantidade) {
		Random ramdon = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ramdon.nextInt(quantidade);
		}
		
		return array;
	}
	
	public static int[] decrescente(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			v[i] = v.length - i;
		}
		
		return v;
	}
	
	public static int[] crescente(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = i + 1;
		}
		return v;
	}
}
