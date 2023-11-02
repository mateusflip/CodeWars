package codewars.essentials.MaxAndMin;

public class MaxAndMinPrincipal {

	public int min(int[] list) {
		int minimo = list[0];
		for (int i : list) {
			if(i < minimo) {
				minimo = i;
			}
		}
	    return minimo;
	  }
	  
	  public int max(int[] list) {
		  int maximo = list[0];
			for (int i : list) {
				if(i > maximo) {
					maximo = i;
				}
			}
		    return maximo;
	  }
}
