package imd0412.DateAPI;

import org.junit.Test;

public class AppTestException {

	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException() {
		DateUtil.nextDate(45, 15, 1543);
	}

}
