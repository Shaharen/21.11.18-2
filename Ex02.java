package 반복문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 키보드로부터 입력 받은 수가 10보다 작을때만 계속 정수를 입력받는 모델
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
				
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if(num > 10) {
				break;  // 해당하는 반복문을 종료 = 분기문
			}
		}
		System.out.println("종료되었습니다.");
		
		
		sc.close();

	}

}
