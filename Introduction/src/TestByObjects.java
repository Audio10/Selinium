import org.openqa.selenium.chrome.ChromeDriver;

public class TestByObjects {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\claud\\drive\\Udemy\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		// Seleccionar un objeto por id. Para enviar se ocupa sendKeys.
		driver.findElementById("email").sendKeys("claudiojesus_10@hotmail.com");
		driver.findElementById("pass").sendKeys("america2010");
		
		/// Seleccionar un objeto y enviarlo.
		//driver.findElementById("u_0_b").submit();
		
		// Seleccionar un objeto a por medio del texto que tiene. Y hacer click
		driver.findElementByLinkText("�Has olvidado los datos de la cuenta?").click();
	}
}
