package testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import support.Report;
import testCases.TestCase;


@RunWith(Suite.class)
@SuiteClasses({
	TestCase.class,
})

public class TestSuite {
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TestSuite.class);
	}
	
	@BeforeClass
	public static void setUp() {
		Report.create("SICREDI - FORM DATA", "Preenchimento Formulario");
	}

	@AfterClass
	public static void tearDown() {
		Report.close();
	}

}
