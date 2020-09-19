import java.util.Scanner;

public class Calender {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요");
			int month = scanner.nextInt();
			System.out.printf("%d달은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Bye~");
		scanner.close();
		
	}

}
