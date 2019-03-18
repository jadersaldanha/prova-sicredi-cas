package verificationPoints;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import support.Config;
import support.Generator;
import support.Report;
import support.Screenshot;


public class ValidarMensagemVerificationPoint {
	
	private final WebDriver driver;
	WebDriverWait aguardar;
	String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
  
    public ValidarMensagemVerificationPoint (WebDriver driver) {
    	this.driver = driver;
    	this.aguardar = new WebDriverWait(driver, 10);
    }
    
    public void validarMensagemErro(String message) {
    	if(message.equals(driver.findElement(By.xpath("//*[@id=\"report-success\"]/p")).getText())) {
    		Screenshot.Tirar(driver, screenshotArquivo1);
    		Report.log(Status.PASS, "Exibiu a mensagem corretamente.", screenshotArquivo1);
    	} else {
    		Screenshot.Tirar(driver, screenshotArquivo1);
			Report.logFail("Não exibiu a mensagem corretamente.");
    		fail("Não exibiu a mensagem corretamente.");
    	}
    	//System.out.println(driver.findElement(By.xpath("//*[@id=\"report-success\"]/p")).getText());
    	//driver.findElement(By.xpath("//*[@id=\"report-success\"]/p/text()[1]")).getText()
    }

}
