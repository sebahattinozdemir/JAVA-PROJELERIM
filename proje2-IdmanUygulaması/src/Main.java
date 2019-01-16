import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Antrenman programina hosgeldinzi.");
		
		String islem = "Gecerli Hareketler \n" +
						"Burpee\n" +
						"Pushup\n" +
						"Situp\n" +
						"Squat\n";
		System.out.println(islem);
		
		System.out.println("Bir antrenman programi olusturun.");
		
		System.out.print("Burpee Sayisi:");
		int burpee = scanner.nextInt();
		
		System.out.print("Pushup Sayisi:");
		int pushup = scanner.nextInt();
		
		System.out.print("Situp Sayisi:");
		int situp = scanner.nextInt();
		
		System.out.print("Squat Sayisi:");
		int squat = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(pushup,burpee,situp,squat);
		
		System.out.println("Antrenmaniniz Basliyor...");
		
		String hareketTuru;
		int tekrarSayisi;
		
		while(idman.idmanBittimi() == false) {
			
			System.out.print("Harekat Turu (Burpee,Pushup,SitUp,Squat):");
			hareketTuru = scanner.nextLine();
			System.out.print("Bu hareketten kac tekrar yapmak istiyorsunuz:");
			tekrarSayisi = scanner.nextInt();
			scanner.nextLine();
			
			idman.hareketYap(hareketTuru, tekrarSayisi);
		}
		
		System.out.println("Tebrikler antrenman bitti.");
		scanner.close();
	}
}
