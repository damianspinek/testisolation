package edu.iis.mto.powermock;

public class SingletonService {

	private static SingletonService instance;

	private SingletonService() {
	}

	public static SingletonService getInstance() {
		if (instance == null) {
			instance = new SingletonService();
		}
		return instance;
	}

	public void serviceMethod(){
		
	}
	
}
