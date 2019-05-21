package com.vektorel;

public class Arac {

	public int hiz;
	public String yonlendirme_turu;
	public int yolcu_kapasitesi;
	public int KDV;
	
	public void hareketEt() {
		System.out.println("Arac Hareket Etti.");	
	}
	
	public void dur() {
		System.out.println("Arac Durdu.");
	}
	
	public void kdvAta(int kdv) {
		this.KDV = kdv;
	}
	
}
