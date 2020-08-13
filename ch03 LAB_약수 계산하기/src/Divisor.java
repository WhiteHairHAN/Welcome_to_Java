/* 난수의 합 계산하기
 * 이번 실습에서는 for 루프를 이용하여 0부터 99사이의 난수의 합을
 * 계산하는 프로그램을 작성해보자
 * 난수의 개수는 사용자가 입력한다.
 */

import java.util.Random;
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
	
		Random generator = new Random();
		
		System.out.println("난수의 개수: ");
		Scanner inputnumber = new Scanner(System.in);
		int number = inputnumber.nextInt();		
		int sum =0;
		
		for(int i =0; i<=number ;i++)
		{
			int acce = generator.nextInt(100);
			sum += acce;
		}
		System.out.println("난수" +number+"의 합은"+sum);
	}

}
