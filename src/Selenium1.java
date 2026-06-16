import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

    public static void main(String[] args) throws InterruptedException {

        // Selenium Manager automatically handles ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
     // Click Create New Account
        driver.findElement(By.linkText("Create new account")).click();

        // Day dropdown selection
        WebElement day_d = driver.findElement(By.id("day"));
        Select daySelect = new Select(day_d);
        Thread.sleep(3000);
        daySelect.selectByIndex(6);

        // Month dropdown selection
        WebElement month_m = driver.findElement(By.id("month"));
        Select monthSelect = new Select(month_m);
        Thread.sleep(3000);
        monthSelect.selectByVisibleText("Jul");

        // Year dropdown selection
        WebElement year_y = driver.findElement(By.id("year"));
        Select yearSelect = new Select(year_y);
        Thread.sleep(3000);
        yearSelect.selectByValue("2000");

        // Optional: close browser after a few seconds
        Thread.sleep(3000);
        driver.quit();
    }
}