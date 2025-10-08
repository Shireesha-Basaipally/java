package Demo;

import org.junit.Ignore;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class hello {
	@RepeatedTest(2)
	@Test
	public void show() {
		System.out.println("this is show method");
	}
	@Ignore
	public void hi() {
	System.out.println("this is hii method");
	}
	@Test
	public void test() {
		System.out.println("this is test method");
		
	}

}
