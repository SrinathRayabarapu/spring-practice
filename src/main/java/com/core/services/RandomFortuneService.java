package com.core.services;

public class RandomFortuneService implements FortuneService {

	@Override
	public void getFortune() {
		System.out.println("It's your Random fortune today!");
	}

}
