package emailAdminastrationApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	private String mail;
	@SuppressWarnings("unused")
	private String alternateMail;
	private int depCode;
	private int passwordLength = 8;
	private String company = "ekinoks";

	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		Scanner scanner = new Scanner(System.in);

		System.out.println("0 for sales \n " + "1 for development\n" + "2 for accounting");
		System.out.println("Choose a department code above :");

		depCode = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

		if (depCode == 0) {

			department = "sales";
		}

		else if (depCode == 1) {

			department = "development";
		}

		else if (depCode == 2) {

			department = "accounting";
		} else {

			department = "";
		}

		this.mail = firstName + "." + lastName + "@" + department + "." + company + "." + "com";
		System.out.println("Your Email: " + mail);

		password = generatePassword(passwordLength);

		System.out.println("Your password: " + password);
	}

	private String generatePassword(int length) {

		String pass = "QWERTYUIOPASDFGHJKLZXCVBNM._+=123456789/%^$";

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {

			int rand = (int) ((Math.random() * pass.length()));

			password[i] = pass.charAt(rand);

		}

		return new String(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public void setAlternateMail(String alternateMail) {
		this.alternateMail = alternateMail;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMail() {
		return mail;
	}

}
