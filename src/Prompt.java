import java.util.Scanner;

public class Prompt {
	
	/*
	 * parse week = ���ϸ�
	 * return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	
	public int parseDay(String week) {
		if (week.equals("su")) {
			return 0;
		} else if (week.equals("mo")) {
			return 1;
		} else if (week.equals("tu")) {
			return 2;
		} else if (week.equals("we")) {
			return 3;
		} else if (week.equals("th")) {
			return 4;
		} else if (week.equals("fr")) {
			return 5;
		} else if (week.equals("sa")) {
			return 6;
		} else {
			return 0;
		}
	}
		

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		int year = 2017;

		while (true) {
			System.out.println("�⵵�� �Է��ϼ���.(exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break;
			System.out.println("���� �Է��ϼ���.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			

			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}

			cal.printCalender(year, month);
		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		// �� ����
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
