import java.util.Scanner;

public class Login {

	public boolean login(Hesap hesap) {

		String userName;
		String password;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kullanici adini giriniz:");
		userName = scanner.nextLine();
		
		System.out.print("Parolanizi giriniz:");
		password = scanner.nextLine();

		if (hesap.getUserName().equals(userName) && hesap.getPassword().equals(password)) {

			System.out.println("Basarili bir sekilde giris yaptiniz.");

			return true;
		}

		else {

			return false;
		}

	}
}
