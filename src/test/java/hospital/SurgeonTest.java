package hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest  {
	
	Surgeon underTest = new Surgeon("2222", "Harry", true);
	
	@Test
	public void assertThatSurgeonIsOperating () {
		boolean check = underTest.getIsOperating();
		assertTrue(check);
	}
	
	
	

}
