import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("eureka@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		
		if(et.equalsIgnoreCase(et)) {
			System.out.println("Test Successfull");
		}
		else {
			System.out.println("Test Unsuccessfull");
		}
}

}
