package imd0412.DateAPI;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AppTestParameterized {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			// (Instrução)
			// {day, month, year, expected},
			//(58)
			{29, 04, 2015, "30/4/2015"},
			//(62)
			{29, 02, 2012, "1/3/2012"},
			//(67)
			{31, 12, 2010, "1/1/2011"},
			//(isLeapYear)
			{28, 02, 2001, "1/3/2001"},
			//(isLeapYear)
			{28, 02, 2000, "29/2/2000"},
			//(isLeapYear)
			{28, 02, 1900, "1/3/1900"},
		});
	}
	
	private int day, month, year;
	private String dateExpected;
	
	public AppTestParameterized(int day, int month, int year, String dateExpected) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.dateExpected = dateExpected;
	}
	
	@Test
	public void evaluateExpression() {
		String expected = DateUtil.nextDate(this.day, this.month, this.year);
		assertEquals(this.dateExpected, expected);
	}

}
