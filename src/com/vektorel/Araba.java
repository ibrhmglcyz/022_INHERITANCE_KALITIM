package com.vektorel;

public class Araba extends KaraTasiti{

	public Araba() {
		tekerlek_sayisi = 4;
		yolcu_kapasitesi = 5;
		yonlendirme_turu = "direksiyon";
		vites_sayisi = 5;
		motor_hacmi = 2300;
		if(motor_hacmi>1800) {
			kdvAta(23);
		}
		else
			kdvAta(18);
		
	}
	
	public void ozellik_goster() {
		System.out.println("*** Arabanin Ozellikleri ***");
		System.out.println("Hiz..............: "+ hiz);
		System.out.println("Yonlendirme Turu.: "+ yonlendirme_turu);
		System.out.println("Yolcu Kapasitesi.: "+ yolcu_kapasitesi);
		System.out.println("Motor Hacmi......: "+ motor_hacmi);
		System.out.println("Vites Sayisi.....: "+ vites_sayisi);
		System.out.println("Yakit Turu.......: "+ yakit_turu);
		System.out.println("Tekerlek Sayisi..: "+ tekerlek_sayisi);
		System.out.println("KDV..............: "+ KDV);

	}
	
	public void hareketEt() {
		System.out.println("Araba Hareket Etti.");	
	}
	
	public void dur() {
		System.out.println("Araba Durdu.");
	}
	
}
