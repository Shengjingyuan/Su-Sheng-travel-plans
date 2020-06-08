package 四则运算;

import static org.junit.Assert.*;

import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public  class Test2Test {
	public static Test2 Test2_Test = new Test2();
    @Before
    public void setUp() throws Exception {
    }
 
    @After
    public void tearDown() throws Exception {
    }
	
    @Test
	public void testadd() {
		boolean ans = true;
		boolean val;
		double num1 = 32;
		double x=10,y=22;
		val = Test2_Test.add(x,y);
		assertEquals("加法错误！",ans,val);	
	}
	@Test
	public void testminus() {
		boolean ans = true;
		boolean val;
		double num1 = 16;
		double x=44,y=28;
		val = Test2_Test.minus(x,y);
		assertEquals("减法错误！",ans,val);		
	}
	@Test
	public void testtimes() {
		boolean ans = true;
		boolean val;
		double num1 = 72;
		double x=12,y=6;
		val = Test2_Test.times(x,y);
		assertEquals("乘法错误！",ans,val);	
		
	}
	@Test
	public void testDiv() {
		boolean ans = true;
		boolean val;
		double num1 = 11;
		double x=33,y=3;
		val = Test2_Test.Div(x,y);
		assertEquals("除法错误！",ans,val);	
		
	}
	

}
