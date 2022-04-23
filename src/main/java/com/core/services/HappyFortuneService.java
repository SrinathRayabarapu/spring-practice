package com.core.services;

public class HappyFortuneService implements FortuneService{

	@Override
	public void getFortune() {
		System.out.println("Today is your lucky day..!!");
	}
}
