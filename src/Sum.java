import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//�Է�: Ű����� �� ���� �Է��� �޴´�.
		//���: ȭ�鿡 �� ���� ���� ����Ѵ�.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("�� ���� �Է��� �ּ���");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		
		// System.out.println("�� ���� ����" + (a + b) + "�Դϴ�.");
		System.out.printf("%d�� %d�� ���� %d�Դϴ�", a, b, a + b);
		scanner.close();
	}

}
