import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement link = driver.findElement(By.cssSelector("form#login_form table tbody tr td.login_form_label_field a"));
		
		link.click();
		
		Thread.sleep(2000L);
/*		driver.get("http://www.amazon.com");
		WebElement accountDD = driver.findElement(By.cssSelector("#nav-link-shopall"));
		
		accountDD.click();*/
		
		
		driver.close();
		
	}

}
