package �ݺ���;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ű����κ��� �Է� ���� ���� 10���� �������� ��� ������ �Է¹޴� ��
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
				
		while(true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if(num > 10) {
				break;  // �ش��ϴ� �ݺ����� ���� = �б⹮
			}
		}
		System.out.println("����Ǿ����ϴ�.");
		
		
		sc.close();

	}

}
