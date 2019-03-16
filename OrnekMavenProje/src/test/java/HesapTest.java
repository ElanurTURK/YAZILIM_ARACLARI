import org.junit.*;

import Hesap.hesaplama;


public class HesapTest {
	
	//@org.junit.Test
	@Test
	public void testTopla() {
		Hesap h = new Hesap();
		int sonuc = h.topla(345, 453);
		
		Assert.assertEquals(798, sonuc);
	}
	
	
	public void testCikar() {
		Hesap h = new Hesap();
		int sonuc = h.cikar(50, 25);
		
		Assert.assertEquals(25, sonuc);
	}
	
	
	public void testCarp() {
		Hesap h = new Hesap();
		int sonuc = h.carp(10, 3);
		
		Assert.assertEquals(30, sonuc);
	}
	
	
	public void testBol() {
		Hesap h= new Hesap();
		int sonuc = h.bol(40, 10);
		
		Assert.assertEquals(3, sonuc);
	}
	
	//10! = 3628800
	
	
	public void testFaktoriyel() {
		
		Hesap h = new Hesap();
		
		int sonuc = h.faktoriyel(10);
		
		Assert.assertEquals(3628800, sonuc);
		
	}
	
	

}

