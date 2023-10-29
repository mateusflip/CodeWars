package codewars.essentials.wholikesIt;

import java.util.Arrays;
import java.util.List;

public class Solution {
	 public static String whoLikesIt(String... names) {
		
		 //System.out.println(teste[0]);
		 
	        String frase = new String();
	      
	        //Nenhum nome
	        if(names.length == 0){
	        frase = "no one likes this";
	      }
	      
	      //Somente um nome
	        if(names.length == 1) {
	        		System.out.println(names[0] + " likes this");
	        		frase = names[0] + " likes this";
	        	
	        }
	      //Dois nomes
	      if(names.length == 2) {
	    	  frase = names[0] +" and " + names[1] +  " like this";
	    	  System.out.println(frase);
	      }
	      if(names.length == 3) {
	    	  frase = names[0] +", "+ names[1] +" and " + names[2] +  " like this";
	      }
	      if(names.length >= 4) {
	    	  frase = names[0] +", "+ names[1] +" and " + (names.length - 2) +  " others like this";
	    	  System.out.println(frase);
	      }
	        return frase;
	    }

}


