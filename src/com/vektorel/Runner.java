package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		Araba arb1 = new Araba();
		Ucak ucak = new Ucak();
		
		arb1.ozellik_goster();
		
		System.out.println();
		
		arb1.hareketEt(); //araba ve ucakta overriding islemini ogreniyoruz.
		arb1.dur();

		System.out.println();
		
		ucak.hareketEt(); //araba ve ucakta overriding islemini ogreniyoruz.
		ucak.dur();
		
		//POLIMORPHISM - COK BICIMLILIK
		System.out.println();
		Arac a1 = new Araba(); //Arac = new ARABA yaziya dikkat et
		a1.hareketEt();
		a1 = new Ucak();
		a1.hareketEt();
		a1 = new Arac();
		a1.hareketEt();
		
		
	}

}
