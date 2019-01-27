package student.database.app;

import java.util.Scanner;

public class studentApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfStudent = 0;
		String name;
		String lastName;
		int gradeYear;
		String code;
		System.out.print("How many student do you want to add ?");

		numberOfStudent = scanner.nextInt();
		scanner.nextLine();

		Student[] student = new Student[numberOfStudent];

		System.out.println("Enter the student names and grades");
		for (int i = 0; i < numberOfStudent; i++) {

			System.out.print(i + 1 + ". student first name :");
			name = scanner.nextLine();
			System.out.print(i + 1 + ". student last name:");
			lastName = scanner.nextLine();

			System.out.println("1- Freshman \n" + "2- Sophomore\n" + "3- Junior\n" + "4- Senior\n");

			System.out.print(i + 1 + ". student class level:");
			gradeYear = scanner.nextInt();
			scanner.nextLine();

			student[i] = new Student(name, lastName, gradeYear);

			System.out.println("AVAILABLE COURSES :" + "\n 1- History 101 \n" + "2- Mathematics 101\n"
					+ " 3- English 101\n" + " 4- Chemistry 101\n" + " 5- Computer Science 101\n");

			while (true) {

				System.out.print("Enter course code (Q to quit):");
				code = scanner.nextLine();

				if (code.equals("1")) {

					student[i].enroll(Courses.History101);
				}

				else if (code.equals("2")) {

					student[i].enroll(Courses.Mathematics101);
				}

				else if (code.equals("3")) {

					student[i].enroll(Courses.English101);
				} else if (code.equals("4")) {

					student[i].enroll(Courses.Chemistry101);
				}

				else if (code.equals("5")) {

					student[i].enroll(Courses.ComputerScience101);
				} else if (code.equalsIgnoreCase("q")) {

					break;
				}
			}

			student[i].status();

		}

		scanner.close();
	}

}
