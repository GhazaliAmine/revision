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
	public void itShouldReturn1when2entred() {
		assertEquals(1, revision.process(2));
	}

	@Test
	public void itShouldReturn2when3entred() {
		assertEquals(2, revision.process(3));
	}

}
