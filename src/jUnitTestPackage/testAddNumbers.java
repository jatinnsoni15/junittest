package jUnitTestPackage;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions,*;
import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions Junit=new jUnitFunctions();
		int result=Junit.AddNumbers(300,200);
		assertEquals (500,result);
	}

}