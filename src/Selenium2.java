import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.edureka.co/");
        
        System.out.println(driver.getTitle()); //Print the title of the current web page in the console.
        
        driver.quit();

	}

}
