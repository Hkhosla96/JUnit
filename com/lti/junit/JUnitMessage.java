package com.lti.junit;

public class JUnitMessage {
	static String m;
	JUnitMessage(String msg)
	{
	m=msg;	
	}
static String printmessage()
{
	return m;
	}
static String printHiMessage()
{
return"hi!"+m;	
}
}
