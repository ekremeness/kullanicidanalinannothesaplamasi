package enes;
import java.util.Scanner;
 

public class test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("adınızı giriniz");
		String isim = scanner.nextLine();
		
		System.out.print("soyadınızı giriniz");
		String soyisim = scanner.nextLine();
		
		System.out.print("dersi giriniz");
		String dersismi = scanner.nextLine();
		
		System.out.println("vize1 giriniz");
		double vize1 = scanner.nextDouble();
		
		System.out.println("vize 2 giriniz");
		double vize2 = scanner.nextDouble();
		
		System.out.println("final giriniz");
		double finalnot = scanner.nextDouble();
		
		
		double sonuc = (vize1*0.3) + (vize2*0.3) + (finalnot*0.4);
		
		if (sonuc >= 60) {
			System.out.print(isim +" "+ soyisim +" "+"adlı öğrenci"+" "+ dersismi+" "+sonuc+" "+"dersi geçmiştir");
			
		}
		else {
			System.out.println("dersten kaldınız");
		}
	}
}
