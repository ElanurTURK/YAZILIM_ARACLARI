
public class Hesap {
	
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	
	public int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	public int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
	
	public int faktoriyel(int sayi) {
		int sonuc = 1;
		for(int i=1; i<=sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}
}

