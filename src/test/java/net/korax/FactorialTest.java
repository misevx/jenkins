package net.korax;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("## FACTORIAL TEST ##")
public class FactorialTest {
	@Test
	@DisplayName("-> NEGATIVE TESTING ...")
	public void negativeValueTest() {
		assertEquals(Factorial.compute(-100), 0);
	}

	@Test
	public void zeroValueTest() {
		assertEquals(Factorial.compute(0), 1);
	}

	@Test
	public void oneValueTest() {
		assertEquals(Factorial.compute(1), 1);
	}

	@Test
	public void someValueTest() {
		assertEquals(Factorial.compute(5), 120);
	}
}
