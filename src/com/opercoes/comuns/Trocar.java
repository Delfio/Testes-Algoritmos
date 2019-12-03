package com.opercoes.comuns;

public class Trocar {
	
	public static void trocar(int[] vetor,int i , int menor) {
        int aux = vetor[i];   
        vetor[i] = vetor[menor];  
        vetor[menor] = aux;
        /*
		int aux = array[j];
		array[j] = array[j+1];
		array[j+1] = aux;
		*/
	}

}
