package �ݺ���;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �ݺ������� ���� ���߱�
		Scanner sc = new Scanner(System.in);
		
		int answer = 30;
		int user = 0;
		int cnt = 0;
				
		// while
		while(user != answer) {
			System.out.print("������ �Է����ּ��� >> ");
			user = sc.nextInt();
			cnt++;
		}
		System.out.println("�õ��� Ƚ�� : " + cnt);
		
		sc.close();
		

	}

}
