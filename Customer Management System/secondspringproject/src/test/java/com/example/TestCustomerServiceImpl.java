package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Customer;

public class TestCustomerServiceImpl {

		Customer c=new Customer();
		@Test
		//Negative Testing
		public void testgetuName() {
			assertEquals("Shraddha",c.getuName());
		}
		
}

