package kr.hs.emirim.passposs.aopcal.main;

import kr.hs.emirim.passposs.aopcal.cal.Calculator;
import kr.hs.emirim.passposs.aopcal.cal.ImpCalculator;
import kr.hs.emirim.passposs.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(100);
		System.out.println("Imp 100 : " + f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		System.out.println("Imp 100 : " + f1);
	}

}
