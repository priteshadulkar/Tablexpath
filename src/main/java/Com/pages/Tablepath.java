package Com.pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tablepath {

	public static WebDriver driver ;
	public static Properties pro ;
	@BeforeClass
	public static void table() throws IOException, Exception {
	     System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.navigate().to("http://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		
	}
    @Test(priority=0)
	public static  void Marcury() throws Exception {
		 
		 List<WebElement> el =driver.findElements(By.xpath("//table[@width='110']/tbody/tr/td/table/tbody/tr/td[2]"));
		for(WebElement itr : el)
		{
			
			 String data =itr.getText();
			 System.out.println(data);
			 
			 
			  if(data.contains("Destinations"))
			  {
				     itr.click();
				     Thread.sleep(2000);
				     System.out.println("Hotels clicked");
				     System.out.println(driver.getTitle());
				     driver.findElement(By.xpath("//*[@width='118']")).click();
				     Thread.sleep(2000);
				     System.out.println("1st priority done");
			  }
	    }
	}
    
	@Test(priority=1)
		 public static void Tablelist() throws Exception {
			System.out.println("asndasn");
			 Thread.sleep(2000);
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,400)");
			 Thread.sleep(2000);
			 // to verify the Htmal
			 
			String Tagname = driver.findElement(By.xpath("//p[@align='center']//following::img[@src='images/html.gif']")).getText().toString();
			System.out.println(Tagname);
			//
			 
			 List<WebElement> el= driver.findElements(By.xpath("//table[@width='100%']/tbody/tr[3]/td/table/tbody/tr/td[1]"));
			 
				for(WebElement itr : el)
				{
					 String data =itr.getText();
					 System.out.println(data);
				}
			 
		/* for(int a = 1 ; a<=4 ; a++) {
			// for( int j = 1 ; j<=2 ; j++) {
			 System.out.println("a for loop execute");
			 System.out.println(a);
		 
	String text= driver.findElement(By.xpath("//table[@width='100%']/tbody/tr[3]/td/table/tbody/tr[a ]/td[1]")).getText();
		 
	System.out.println(text);
			}*/
				Thread.sleep(1000);
				
	}
	//}
}
