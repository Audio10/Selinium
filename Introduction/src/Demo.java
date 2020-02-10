import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author claud
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\claud\\drive\\Udemy\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// Obtener el titulo de la pantalla.
		System.out.println(driver.getTitle());
		
		// Si estas llegando a la url especificada.
		System.out.println(driver.getCurrentUrl());
		
		// Obtener el data source de la pagina
		System.out.println(driver.getPageSource());
		
		// cambiar url
		driver.get("https://yahoo.com");
		
		// Navegar hacia anterior.
		driver.navigate().back();
		
		// Regresar al siguiente.
		driver.navigate().forward();
		
		// cierra el browser.
		driver.close();
		
		// Cierra todos los browser abiertos por selenium.
		driver.quit();
		
	}

}
