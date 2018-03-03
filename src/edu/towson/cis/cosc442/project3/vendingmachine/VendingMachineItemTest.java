package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	VendingMachine vending;
	VendingMachineItem item;

	@Before
	public void setUp() throws Exception {
	    item = new VendingMachineItem("Mountain Dew", 2.00); 
	}
	
	//Throws less than 0 exception in constructor 
	@Test
	public void constructorException() {
		try {
			item = new VendingMachineItem("Mountain Dew", -5); 
		}
		catch (Exception e) { 
			 String expectedMessage = "Price cannot be less than zero";
			 assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		}
	}

	//testGetName ensures that the constructor set the name to "Mountain Dew". 
	@Test
	public void testGetName() {
		assertEquals("Mountain Dew", item.getName());
	}

	//testGetPrice ensures that the constructor set the price to 2.00. 
	@Test
	public void testGetPrice() {
		assertEquals(2.00, item.getPrice(), 0);
	}

	@After
	public void tearDown(){
		item = null;
		
	}
}
