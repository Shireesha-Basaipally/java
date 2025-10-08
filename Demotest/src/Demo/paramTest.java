package Demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class paramTest {
     @DisplayName("junittest")
	@ParameterizedTest
	@ValueSource(strings = {"book","peak"})
	void endswith(String str)
	{
		assertTrue(str.endsWith("k"));
		
	}
}
