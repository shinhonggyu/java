import java.util.Scanner;

public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	
	
}
		
		
		
		
		
		
		
//		int[] result = new int[9];
//		for(int j = 2; j < 10; j++) {
//			
//		for(int i = 0; i < result.length; i++) {
//			result[i] = j * (i + 1);
//			}
//			for(int i = 0; i < result.length; i++) {
//				System.out.println(result[i]);
//			}
//		}
		
		

//		System.out.println("������ �� ����� ����? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("����ڰ� �Է��� �� : " + number );
//		
//		if (number < 2 ) {
//			System.out.println("���� �߸� �Է��߽��ϴ�");
//		}	else if (number > 9) {
//			System.out.println("���� �߸� �Է��߽��ϴ�");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
//		}
