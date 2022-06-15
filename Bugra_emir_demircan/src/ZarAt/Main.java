package ZarAt;

/**
* 
*e
*/


import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
	
	public static int Zar1() {
		
		Random rnd1 = new Random();
		int sayi1 = rnd1.nextInt(6);
		
		return(sayi1);
	}
	
	public static int Zar2() {
		
		Random rnd2 = new Random();
		int sayi2 = rnd2.nextInt(6);
		
		return(sayi2);
	}

	
	
	public static void FarscaSayilar() {
		String[] FarscaSayilar = {"", "YEK", "DU", "SE", "CIHAR", "PENC", "SES"};
		
		System.out.println(" ------------------------------ \n Sayıların farsca karsılıkları \n **********************e");
		System.out.println("        1 ---> " + FarscaSayilar[1]);
		System.out.println("        2 ---> " + FarscaSayilar[2]);
		System.out.println("        3 ---> " + FarscaSayilar[3]);
		System.out.println("        4 ---> " + FarscaSayilar[4]);
		System.out.println("        5 ---> " + FarscaSayilar[5]);
		System.out.println("        6 ---> " + FarscaSayilar[6]);
	}
	
    
	
	public static void ZarlarinKarsiligi() {
		
		String[] FarscaSayilar = {"", "YEK", "DU", "SE", "CIHAR", "PENC", "SES"};
		
		int FZar1 = Zar1() + 1;
		int FZar2 = Zar2() + 1;
		
		System.out.println(" \n ZARLAR ATILDI!\n -----------");
		System.out.println(" 1. Zar : " + FZar1 + "  / Farsca karsılıgı : " + FarscaSayilar[FZar1]);
		System.out.println(" - - - - - - - - - - - - - - - - - - - ");
		System.out.println(" 2. Zar : " + FZar2 + "  / Farsca karsılıgı : " + FarscaSayilar[FZar2] + "\n");
	}
	
	
	
	public static void EkranaYazdirma() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Sayıların farsca karsılıgını görmek ıstermısın? (E/H)");
		char GirilenTus = sc.next().charAt(0);
		
		if (GirilenTus == 'E' ) {
			FarscaSayilar();
		}else if(GirilenTus == 'H' ) {
			System.out.println(" Program Kapatılıyor!");
			System.exit(0);
		}else{
			System.out.println(" Gecersiz tus'a bastınız! /Programı tekrar baslatın");
		}
	}
	
	
	
	public static void ProgarmiTekrarla() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println(" \n Programı tekrarlamak ıstermısınız? (E/H)");
		char Cevap = scn.next().charAt(0);
		
		if (Cevap == 'E' ) {
			ZarlarinKarsiligi();
			
			EkranaYazdirma();
		}else if(Cevap == 'H' ) {
			System.out.println(" Program kapatılıyor!");
			System.exit(0);
		}else{
			System.out.println(" Gecersız tus'a bastınız! / Programı tekrar baslatın");
		}
		
	}
	
	public static void main(String[] args) {
		
		ZarlarinKarsiligi();
		
		EkranaYazdirma();
		
		ProgarmiTekrarla();
	}

}