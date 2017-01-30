package ergasia;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class test {


	@Test
	public void testcounter() {
		emp junit =new emp();
		int result = junit.counter;
		assertEquals(0,result);
	}

}