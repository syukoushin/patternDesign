package singletonDesignPattern.singleton;

public class SingletonObject {
	private SingletonObject() {
		// TODO Auto-generated constructor stub
		System.out.println("SingletonObject class's constructor.");
	}
	
	private static SingletonObject instance = new SingletonObject();
	
	public static SingletonObject getInstanct(){
		return instance;
	}
	public String showMessage(){
		return "singleton design pattern";
	}
}
