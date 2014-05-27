package revision;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClassTest {

	private Revision revision;

	@Before
	public void setUp() throws Exception {

		revision = new Revision();
	}

	@Test
	public void itShouldReturnString() {

		assertEquals("how are you", revision.sayHello("hi"));
	}

}
