import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\claud\\drive\\Udemy\\Selenium\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		// Obtener el titulo de la pantalla
		System.out.println(driver.getTitle());

	}

}
