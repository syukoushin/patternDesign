package singletonDesignPattern.test;

import singletonDesignPattern.singleton.SingletonObject;

public class Test {
	public static void main(String[] args) {
		SingletonObject singletonObject = SingletonObject.getInstanct();
		System.out.println(singletonObject.showMessage());
	}
}
