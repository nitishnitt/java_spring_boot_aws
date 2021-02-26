package com.cts.SpringAopDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {
	@Bean
	public EasyBank easyBank()
	{
		EasyBank e=new EasyBank();
		e.setPinCode(6789);
		e.setBalance(10000);
		return e;
	}
	
}
