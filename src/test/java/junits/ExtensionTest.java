package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvExtension.class)
public class ExtensionTest {

	
	@Test
	public void junit1() {
		assertTrue(StringFunctions.isPalindrome("radar"));
		System.out.println("Inside Test");
	}
}
