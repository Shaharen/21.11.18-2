package 반복문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수와 짝수가 각각 몇개 입력되었는지 출력
		// -1 이 입력되면 프로그램 종료
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int even = 0; // 짝수의 개수
		int odd = 0; // 홀수의 개수

		while (true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				even += 1; // even =even + 1;
			} else if (num == -1) {
				break;
			} else {
				odd += 1;
			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
