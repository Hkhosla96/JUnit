package com.lti.junit;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;


public class AnnotationExample {
	
private ArrayList<String> list;
@BeforeClass
public static void m1()
{
	System.out.println("USing @BeforeClass, extend before all test"+"cases");
	}
	
@Before
public void m2()
{
	list = new ArrayList<String>();
	System.out.println("Using @Before annotations , executed before each"+"test cases");
	}

@AfterClass
public static void m3()
{
	System.out.println("Using @AfterClass, extend after all test cases");
	}

@After
public void m4()
{
	list.clear();
	System.out.println("Using @After annotations , executed after each test cases");
	}

	@Test
	public void m5() {
		list.add("test");
assertFalse(list.isEmpty());	
assertEquals(1,list.size());
System.out.println("In test method");
	
	}
	
@Ignore
public void m6()
{
	System.out.println("Using @Ignore , this execution is ignored");
}

@Test(timeout=10)
public void m7()
{
	System.out.println("Using @Test(timeout),it can be used to enforce timeout"+"in JUnit4 test case" );
	}

@Test(executed=NoSuchMethodException.class)
public void m8()
{
	
	}

}