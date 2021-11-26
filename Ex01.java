package 반복문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 반복문으로 정답 맞추기
		Scanner sc = new Scanner(System.in);
		
		int answer = 30;
		int user = 0;
		int cnt = 0;
				
		// while
		while(user != answer) {
			System.out.print("정답을 입력해주세요 >> ");
			user = sc.nextInt();
			cnt++;
		}
		System.out.println("시도한 횟수 : " + cnt);
		
		sc.close();
		

	}

}
