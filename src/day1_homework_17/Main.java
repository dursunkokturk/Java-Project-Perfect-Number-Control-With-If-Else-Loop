package day1_homework_17;

public class Main {

	public static void main(String[] args) {
		
		// Mukemmel Sayi 
		// Sayinin Kendisi Haric Kendisine Kadar Olup Tam Bolunen Sayilarin Toplami 
		// Sayinin Kendisine Esit Olmasidir
		int number = 28;
		
		int total = 0;
		
		for (int i = 1 ; i < number ; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number) {
			System.out.println("M�kemmel Say�d�r");
		}else {
			System.out.println("M�kemmel Say� De�ildir");
		}
	}
}