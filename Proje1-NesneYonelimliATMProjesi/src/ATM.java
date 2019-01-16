import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {

		System.out.println("Bankimiza Hosgeldiniz.");
		System.out.println("*********************");
		System.out.println("Kullanici Girisi");
		System.out.println("*********************");

		Login login = new Login();
		int giris_hakki = 3;

		while (true) {

			if (login.login(hesap)) {

				System.out.println("Giris Basarili.");
				break;
			}

			else {

				giris_hakki--;
				System.out.println("Giris Basarisiz.");
			}

			if (giris_hakki == 0) {

				System.out.println("Giris hakkiniz dolmustur.");
				break;
			}

		}
		Scanner scanner = new Scanner(System.in);
		String islem;
		String islemler = "1. Bakiye Goruntule\n" + "2. Para Yatirma\n" + "3. Para Cekme\n"
				+ "4. Cikis icin q'ya basiniz.";
		
		while (true) {

			System.out.println("*********************");
		    System.out.println(islemler);	
			System.out.println("*********************");

			System.out.print("Islemi Seciniz:");

			islem = scanner.nextLine();

			if (islem.equals("1")) {

				hesap.showInfo();
			}

			else if (islem.equals("2")) {

				System.out.print("Yatirmak istediginiz miktari giriniz:");
				int amount = scanner.nextInt();
				scanner.nextLine();
				hesap.depositMoney(amount);
			}

			else if (islem.equals("3")) {

				System.out.print("Çekmek istediginiz miktari giriniz:");
				int amount = scanner.nextInt();
				scanner.nextLine();
				hesap.withDrawMoney(amount);

			} else if (islem.equals("q")) {
				scanner.close();
				break;
				
			}

		}

	}
}
