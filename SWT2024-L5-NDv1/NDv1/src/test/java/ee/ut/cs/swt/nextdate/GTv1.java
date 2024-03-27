package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(23, 23, 23);
	    String string0 = nextDate0.run(5, 23, 1834);
	    assertEquals("5/24/1834", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 1839, 1839);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1880);
	    assertEquals("11/12/1880", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 31, 1970);
	    assertEquals("11/1/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1839);
	    assertEquals("12/13/1839", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 30, 1808);
	    assertEquals("5/1/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 31, 1901);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-112), (-112), (-112));
	    String string0 = nextDate0.run((-112), (-112), (-112));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run((-441), 12, (-441));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 31, 1915);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(23, 23, 23);
	    String string0 = nextDate0.run(754, 754, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 31, 1905);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2022);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1819);
	    assertEquals("2/3/1819", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1930);
	    assertEquals("7/7/1930", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1935);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1879);
	    assertEquals("3/1/1879", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 30, 1872);
	    assertEquals("1/31/1872", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1826);
	    assertEquals("8/9/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(23, 23, 23);
	    String string0 = nextDate0.run(3, 23, 1841);
	    assertEquals("3/24/1841", string0);
	}

}