import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Datepicker {

public static void main(String[] args) throws InterruptedException {
    
     ChromeOptions option = new ChromeOptions();
    
    option.addArguments("--remote-allow-origins=*");

    WebDriver driver = new ChromeDriver(option);
    
    driver.get("https://www.path2usa.com/travel-companion/");
    
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"travel_comp_form\"]/div/div[3]/label")).click();
    
    Thread.sleep(2000);
}
}