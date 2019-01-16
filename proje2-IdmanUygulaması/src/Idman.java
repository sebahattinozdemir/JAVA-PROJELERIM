
public class Idman {

	private int burpeeSayisi;
	private int pushUpSayisi;
	private int sitUpSayisi;
	private int squatSayisi;

	public Idman(int pushUpSayisi, int burpeeSayisi, int sitUpSayisi, int squatSayisi) {

		this.pushUpSayisi = pushUpSayisi;
		this.burpeeSayisi = burpeeSayisi;
		this.sitUpSayisi = sitUpSayisi;
		this.squatSayisi = squatSayisi;
	}

	public int getBurpeeSayisi() {
		return burpeeSayisi;
	}

	public void setBurpeeSayisi(int burpeeSayisi) {
		this.burpeeSayisi = burpeeSayisi;
	}

	public int getPushUpSayisi() {
		return pushUpSayisi;
	}

	public void setPushUpSayisi(int pushUpSayisi) {
		this.pushUpSayisi = pushUpSayisi;
	}

	public int getSitUpSayisi() {
		return sitUpSayisi;
	}

	public void setSitUpSayisi(int sitUpSayisi) {
		this.sitUpSayisi = sitUpSayisi;
	}

	public int getSquatSayisi() {
		return squatSayisi;
	}

	public void setSquatSayisi(int squatSayisi) {
		this.squatSayisi = squatSayisi;
	}

	public void hareketYap(String tur, int sayi) {

		if (tur.equalsIgnoreCase("Burpee")) {

			burpeeYap(sayi);
		} else if (tur.equalsIgnoreCase("Pushup")) {

			pushupYap(sayi);
		}

		else if (tur.equalsIgnoreCase("Situp")) {

			situpYap(sayi);

		}

		else if (tur.equalsIgnoreCase("Squat")) {

			squatYap(sayi);
		}

		else {

			System.out.println("Gecersiz hareket...");
		}

	}

	private void squatYap(int sayi) {

		squatSayisi -= sayi;

		if (squatSayisi == 0) {

			System.out.println("Yapacak squat kalmadi.");
		}

		else if (squatSayisi < 0) {

			System.out.println("Tebrikler hedefledigin squat sayisini gectin.");
		}

		else {

			System.out.println("Kalan Squat Sayisi :" + squatSayisi);
			System.out.println("Kalan situp Sayisi :" + sitUpSayisi);
			System.out.println("Kalan Pushup Sayisi :" + pushUpSayisi);
			System.out.println("Kalan Burpee Sayisi :" + burpeeSayisi);
		}

	}

	private void situpYap(int sayi) {
		// TODO Auto-generated method stub

		sitUpSayisi -= sayi;

		if (sitUpSayisi == 0) {

			System.out.println("Yapacak situp kalmadi.");
		}

		else if (sitUpSayisi < 0) {

			System.out.println("Tebrikler hedefledigin situp sayisini gectin.");
		}

		else {

			System.out.println("Kalan Squat Sayisi :" + squatSayisi);
			System.out.println("Kalan situp Sayisi :" + sitUpSayisi);
			System.out.println("Kalan Pushup Sayisi :" + pushUpSayisi);
			System.out.println("Kalan Burpee Sayisi :" + burpeeSayisi);

		}

	}

	private void pushupYap(int sayi) {
		// TODO Auto-generated method stub
		
		pushUpSayisi -= sayi;

		if (pushUpSayisi == 0) {

			System.out.println("Yapacak pushup kalmadi.");
		}

		else if (pushUpSayisi < 0) {

			System.out.println("Tebrikler hedefledigin pushup sayisini gectin.");
		}

		else {

			System.out.println("Kalan Squat Sayisi :" + squatSayisi);
			System.out.println("Kalan situp Sayisi :" + sitUpSayisi);
			System.out.println("Kalan Pushup Sayisi :" + pushUpSayisi);
			System.out.println("Kalan Burpee Sayisi :" + burpeeSayisi);
		}

	}

	private void burpeeYap(int sayi) {
		// TODO Auto-generated method stub
		
		burpeeSayisi -= sayi;

		if (burpeeSayisi == 0) {

			System.out.println("Yapacak burpee kalmadi.");
		}

		else if (burpeeSayisi < 0) {

			System.out.println("Tebrikler hedefledigin sayiyi gectin.");
		}

		else {

			System.out.println("Kalan Squat Sayisi :" + squatSayisi);
			System.out.println("Kalan situp Sayisi :" + sitUpSayisi);
			System.out.println("Kalan Pushup Sayisi :" + pushUpSayisi);
			System.out.println("Kalan Burpee Sayisi :" + burpeeSayisi);
		}

	}

	public boolean idmanBittimi() {

		if (burpeeSayisi <= 0 && pushUpSayisi <= 0 && sitUpSayisi <= 0 && squatSayisi <= 0) {

			return true;
		} else {
			return false;
		}

	}

}
