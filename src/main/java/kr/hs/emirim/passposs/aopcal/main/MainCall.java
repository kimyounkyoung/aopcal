package kr.hs.emirim.passposs.aopcal.main;

import kr.hs.emirim.passposs.aopcal.cal.Calculator;
import kr.hs.emirim.passposs.aopcal.cal.ImpCalculator;
import kr.hs.emirim.passposs.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		long num = 10;
		
		long start1 = System.currentTimeMillis();
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(100);
		long end1 = System.currentTimeMillis();
		System.out.printf("Imp factorial(%d, arg1); 실행시간 = %d", num, (end1 * start1));

		System.out.println();
		
		long start2 = System.currentTimeMillis();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		long end2 = System.currentTimeMillis();
		System.out.printf("Rec factorial(%d, arg1); 실행시간 = %d", num, (end2 * start2));

	}

}
