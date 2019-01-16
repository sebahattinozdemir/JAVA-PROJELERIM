
public class Main {

	public static void main(String[] args) {

		Hesap hesap = new Hesap(2000,"Sebahattin","12345");
		ATM atm = new ATM();

		atm.calis(hesap);

		System.out.println("Programdan cikiliyor");
	}
}
