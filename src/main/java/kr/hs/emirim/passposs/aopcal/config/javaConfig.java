package kr.hs.emirim.passposs.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.passposs.aopcal.aspect.ExeTimeAspect2;
import kr.hs.emirim.passposs.aopcal.cal.Calculator;
import kr.hs.emirim.passposs.aopcal.cal.RecCalculator;

public class javaConfig {
	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}

	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}
}
