package com.sda.javapoz11.hellospring.hellospring;

import com.sda.javapoz11.hellospring.hellospring.service.BigNumbersGenerator;
import com.sda.javapoz11.hellospring.hellospring.service.RandomGenerator;
import com.sda.javapoz11.hellospring.hellospring.service.SmallNumbersGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}

	@Bean
	public RandomGenerator blabla() {
		return new SmallNumbersGenerator();
	}

	@Primary // adnotacja mowiaca o 'wyzszosci' tego beana nad pozostalymi - potencjalnie dostepnymi w kontekscie
	@Bean // adnotacja na metodzie mowiaca springowi ze ma ta metode wywolac i jej wynik zapisac w kontekscie
	public RandomGenerator bigNumbersGenerator() {
		return new BigNumbersGenerator();
	}
}
