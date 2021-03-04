package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestEx {
	
	@DisplayName("Example for repeated test")
	@RepeatedTest(4)
	public void junit1() {
		System.out.println("Inside junit1");
	}

}
