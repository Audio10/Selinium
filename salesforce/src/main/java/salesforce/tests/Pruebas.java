/**
 * 
 */
package salesforce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author claud
 *
 */
public class Pruebas {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.getDriver();
		
		driver.get("https://pdsdes-apolo.cs101.force.com/FacturacionPagos/s/?language=es_MX");
		driver.findElement(By.linkText("INICIAR   SESI�N")).click();
		
		System.out.println(driver.findElement(By.className("cb-section")));

		
	}

}
