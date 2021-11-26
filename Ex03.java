package 반복문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// A,B 숫자를 입력받아 A-B를 계산하는 프로그램을 작성
		// 두 수가 모두 0이 입력되면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		int a = 0;								// int a = 1;
		int b = 0;								// int b = 1; 로 선언 후 count 제거해도 됨
		
												// int count = 1;
		while(true/*boolean 타입만 가능 */) {		// a != 0 || b != 0 || count == 1
			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");
			b = sc.nextInt();
				if(a == 0 && b == 0 ) {
					break;
				}								// count++
			System.out.println("결과 >> " + (a-b));
		}
		sc.close();
		
		

	}

}
