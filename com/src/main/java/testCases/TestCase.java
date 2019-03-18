package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import support.Config;
import support.CsvDatapool;
import support.Drivers;
import support.Generator;
import support.IDatapool;
import support.Report;
import support.Screenshot;
import tasks.DataTasks;
import verificationPoints.ValidarMensagemVerificationPoint;

public class TestCase {
	private static final String SYSTEM_URL = Config.get("environment");
	private static final String DATAPOOL = Config.get("datapool.pasta");
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private WebDriver driver;
	private IDatapool formdata;
	private DataTasks data;
	private ValidarMensagemVerificationPoint validar;

	@Before
	public void setUp() {
		Report.startTest("Prova SICREDI - Filling form");

		driver = Drivers.getChromeDriver();
		driver.get(SYSTEM_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		formdata = new CsvDatapool(DATAPOOL);
		data = new DataTasks(driver);
		validar = new ValidarMensagemVerificationPoint(driver);
	}

	@Test
	public void testMain() throws InterruptedException {
		data.comboBox1();
		data.addCustomer();
		data.setCustomerName(formdata.getValue("name"));
		data.contactFirstName(formdata.getValue("contactname"));
		data.setLastName(formdata.getValue("lastname"));
		data.setPhone(formdata.getValue("phone"));
		data.setAddress(formdata.getValue("address"));
		data.setAddress2(formdata.getValue("address2"));
		data.setCity(formdata.getValue("city"));
		data.setState(formdata.getValue("state"));
		data.setPostalCode(formdata.getValue("postal"));
		data.setCountry(formdata.getValue("country"));
		data.selectEmployer();
		data.setFixter();
		data.setCreditLimit(formdata.getValue("credit"));
		data.save();

		String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo1);
		Report.log(Status.PASS, "Preencheu Dados do Formulario", screenshotArquivo1);

		validar.validarMensagemErro("Your data has been successfully stored into the database. or");

	}

	@After
	public void tearDown() {
		Report.close();
		this.driver.quit();
	}

}
