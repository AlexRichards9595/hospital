package hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {

	Doctor underTest = new Surgeon("2222", "Harry", "Brain", true);

	@Test
	public void assertThatSurgeonIsOperating() {
		Surgeon surgeon = new Surgeon("2222", "Harry", "Brain", true);
		boolean check = surgeon.getIsOperating();
		assertTrue(check);
	}
	
	

}
