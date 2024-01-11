package codewars.essentials.EvenFibonacciSum;

import java.util.ArrayList;

public class EvenFibonacciSum {
	public static long fibonacci(long max) {
	long a = 0;
    long b = 1; 
    long atual = 0;
    long soma = 0;
    ArrayList<Long> lista = new ArrayList<>();
    //Array<Long> pares = new ArrayList<>();
      for(int i = 0; i < max; i++){
        atual = a+b;
        a = b;
        b = atual;
        lista.add(atual);
        
        if(atual >= max) {
        	return soma;
        }
        
          if(atual % 2 ==0 && atual < max){
            soma = soma + atual;
            //pares.add(atual);
          }
        
      }
    return soma;
	 }

}
