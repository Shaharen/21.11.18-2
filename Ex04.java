package �ݺ���;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� Ȧ���� ¦���� ���� � �ԷµǾ����� ���
		// -1 �� �ԷµǸ� ���α׷� ����
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int even = 0; // ¦���� ����
		int odd = 0; // Ȧ���� ����

		while (true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				even += 1; // even =even + 1;
			} else if (num == -1) {
				break;
			} else {
				odd += 1;
			}
			System.out.println("¦������ : " + even);
			System.out.println("Ȧ������ : " + odd);
		}
		System.out.println("����Ǿ����ϴ�.");
		sc.close();
	}

}
