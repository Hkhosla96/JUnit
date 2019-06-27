package com.lti.junit;
import static org.junit.Assert.*;
import org.junit.Test;
public class SuiteTest1 {
	public String message="Raj";
	JUnitMessage juintmessage = new JUnitMessage(message);
	
	@Test
	public void testJUnitMessage() {
	System.out.println("Junit Message is printing:");
	JUnitMessage.printmessage();
	
	}
	
	@Test
	public void testJUnitHiMessage()
	{
		message="hi!" + message;
		System.out.println("Junit HI message is printing:");
	assertEquals(message,JUnitMessage.printHiMessage());
	System.out.println("Suite Test1 is successful"+message);
	}
}