package br.com.ufg.inf.palindromo;

import org.junit.Assert;
import org.junit.Test;

public class TestarPalindromo {
	
	@Test
	public void main(){
		
		Palindromo validador = new Palindromo();
		
		Assert.assertEquals(true, validador.ehPalindromo("civic"));
		Assert.assertEquals(true, validador.ehPalindromo("noon"));
		Assert.assertEquals(true, validador.ehPalindromo("level"));
		// Assert.assertEquals(true, validador.ehPalindromo("pedro"));
	}

}
