package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStringsTest {

	@Test
	public void test() {
		jUnitFunctions Junit=new jUnitFunctions();
		String result=Junit.AddStrings("Jatin","Swarnkar");
		assertEquals ("JatinSwarnkar",result);
	}

}