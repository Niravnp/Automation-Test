import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\TIB\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
			
	    options.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    WebElement menutext = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]"));
	    
	    menutext.click();
	   
	    driver.close();
}
}