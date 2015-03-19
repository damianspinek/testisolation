package edu.iis.mto.powermock;

public class ClassUnderTestDependentOnStaticService {

	public void doStuff() {
		SingletonService.getInstance().serviceMethod();
	}

}
