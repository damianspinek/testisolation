package edu.iis.mto.powermock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@PrepareForTest( SingletonService.class )
public class StaticSingletonTest {

	@Test
	public void test() {
		mockStatic(SingletonService.class);
		SingletonService serviceMock = mock(SingletonService.class);
		when(SingletonService.getInstance()).thenReturn(serviceMock);
		
		ClassUnderTestDependentOnStaticService tested = new ClassUnderTestDependentOnStaticService(); 
		
		tested.doStuff();
		
		verify(serviceMock).serviceMethod();

	}

}
