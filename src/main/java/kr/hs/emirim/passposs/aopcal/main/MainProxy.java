package kr.hs.emirim.passposs.aopcal.main;

import kr.hs.emirim.passposs.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.passposs.aopcal.cal.ImpCalculator;
//import kr.hs.emirim.passposs.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.passposs.aopcal.cal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal1.factorial(20));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(20));
	}

}
