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
		
		

//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + number );
//		
//		if (number < 2 ) {
//			System.out.println("값을 잘못 입력했습니다");
//		}	else if (number > 9) {
//			System.out.println("값을 잘못 입력했습니다");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
//		}
