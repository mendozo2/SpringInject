package com.oz.Hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oz.beans.Mundo;

@Configuration
public class AppConfig2 {

	@Bean
	public Mundo marte(){
		return new Mundo();
	}
}
