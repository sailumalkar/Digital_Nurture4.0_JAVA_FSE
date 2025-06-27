package com.example;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class MyServiceTest {
	 @Test
	    public void testExternalApi() {
	        // Mock the ExternalApi
	        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
	        when(mockApi.getData()).thenReturn("Mock Data");

	        // Inject mock into service
	        MyService service = new MyService(mockApi);
	        String result = service.fetchData();

	        // Assert result
	        assertEquals("Mock Data", result);
	    }
}
