import java.util.Scanner;

public class Calender {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		System.out.println("���� �Է��ϼ���");
		int month = scanner.nextInt();
		
		
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getMaxDaysOfMonth(month));
		scanner.close();
	}

}
