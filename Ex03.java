package �ݺ���;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// A,B ���ڸ� �Է¹޾� A-B�� ����ϴ� ���α׷��� �ۼ�
		// �� ���� ��� 0�� �ԷµǸ� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		
		int a = 0;								// int a = 1;
		int b = 0;								// int b = 1; �� ���� �� count �����ص� ��
		
												// int count = 1;
		while(true/*boolean Ÿ�Ը� ���� */) {		// a != 0 || b != 0 || count == 1
			System.out.print("A �Է� >> ");
			a = sc.nextInt();
			System.out.print("B �Է� >> ");
			b = sc.nextInt();
				if(a == 0 && b == 0 ) {
					break;
				}								// count++
			System.out.println("��� >> " + (a-b));
		}
		sc.close();
		
		

	}

}
