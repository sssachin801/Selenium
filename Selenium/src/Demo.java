import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{
	public static void main(String args[])throws Exception
	{
		String url="D:\\Webpages\\first.html";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement pwd=driver.findElement(By.xpath("/html/body/input[2]"));
		pwd.sendKeys("12345");
		
		 
	}
}
