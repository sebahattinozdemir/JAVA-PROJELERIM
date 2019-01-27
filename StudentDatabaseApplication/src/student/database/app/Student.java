package student.database.app;

public class Student {

	private String firstName;
	private String lastName;

	private int gradeYear;
	private static int studentUniqueId = 1000;

	private int courseCost = 600;

	private int balance = 0;

	private String enrolledCourses = "";

	private String studentId = "";

	public Student(String firstName, String lastName, int gradeYear) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;

		generateStudentId();

	}

	public void enroll(Courses enrollment) {

		if (enrollment == Courses.Chemistry101) {

			enrolledCourses += "  " + (Courses.Chemistry101).toString() + "\n";
			balance += courseCost;
		}

		if (enrollment == Courses.ComputerScience101) {

			enrolledCourses += "  " + (Courses.ComputerScience101).toString() + "\n";
			balance += courseCost;
		}

		if (enrollment == Courses.English101) {

			enrolledCourses += "  " + (Courses.English101).toString() + "\n";
			balance += courseCost;
		}

		if (enrollment == Courses.History101) {

			enrolledCourses += "  " + (Courses.History101).toString() + "\n";
			balance += courseCost;
		}

		if (enrollment == Courses.Mathematics101) {

			enrolledCourses += "  " + (Courses.Mathematics101).toString() + "\n";
			balance += courseCost;
		}
	}

	public String generateStudentId() {

		studentId += gradeYear;

		studentId += studentUniqueId;

		studentUniqueId++;

		return studentId;

	}

	public void payTuition(int tuition) {

		balance -= tuition;

	}

	public int getBalance() {
		return balance;
	}

	public void status() {

		System.out.println("Name : " + firstName + " " + lastName);

		System.out.println("Student Id: " + studentId);

		System.out.println("Courses enrolled: \n" + enrolledCourses);
		System.out.println("Balance : " + balance);
	}

}
