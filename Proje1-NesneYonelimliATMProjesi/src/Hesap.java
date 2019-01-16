
public class Hesap {

	private int bakiye;
	private String userName;
	private String password;

	 
	public Hesap(int bakiye, String userName, String password) {
		super();
		this.bakiye = bakiye;
		this.userName = userName;
		this.password = password;
	}

	public void showInfo() {

		System.out.println("Bakiye " + bakiye);
		System.out.println("User Name " + userName);
		System.out.println("Password " + password);
	}

	public void withDrawMoney(int amount) {

		bakiye -= amount;
	}

	public void depositMoney(int amount) {

		bakiye += amount;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
