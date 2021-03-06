package kr.hs.emirim.passposs.aopcal.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.emirim.passposs.aopcal.cal.Calculator;
import kr.hs.emirim.passposs.aopcal.config.javaConfig;


public class MainJavaAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(javaConfig.class);
		
		Calculator impCal = ctx.getBean("impCal", Calculator.class);
		long fiveFact1 = impCal.factorial(5);
		System.out.println("impCal.factorial(5) = " + fiveFact1);

		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}

}
