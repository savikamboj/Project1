package StructureOfFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UtilityClass{
	static WebDriver driver;
	static Properties prop;
	
		public void LaunchBrowser() {
			File file= new File("C:\\Users\\skamboj\\workspace\\DemoOneCase\\src\\test\\java\\StructureOfFramework\\Data1.properties");
			FileInputStream fis=null;
		{
		try
		{
			fis= new FileInputStream(file);
			prop= new Properties();
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
					
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skamboj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		String url= prop.getProperty("URL");
		driver.get(url);
		System.out.println("Application page is opened");
		
	}
		}

	
	
    public void Login()
    {  
    	
	driver.findElement(By.id("user")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.name("login2")).submit();
    }

    public void VerifyHomepage()
    { 
    
    	String s= driver.getCurrentUrl();
    
    if(s.equals("https://testing1.tk20.com/campustoolshighered/klogin_body.do"))
    {
    	System.out.println("URL is Correct");
    }
    else
    {
    	System.out.println("URL is wrong");
    }
    }

    public void ArtifactSideMenu()
    {
	driver.findElement(By.xpath("//a[@ href= '#Artifacts']")).click();
    }
    
    
    public void CreateArtifact()
    {
	driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='createNewArtifact']")).click();
	Select so= new Select(driver.findElement(By.id("artifactType")));
	so.selectByVisibleText("All entry artifact instructions: Instance 1");
	driver.findElement(By.xpath("//button[@name='select']")).click();
	driver.findElement(By.id("Description")).sendKeys("Description is entered by Savita");
	
	
	driver.findElement(By.xpath("/html/body/div[8]/main/div[7]/div/div/div/form/div[3]/div/div/button"));
	driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[8]/main/div[7]/div/div/div/form/div[3]/div/div/button")).click();

	
    }
    
  /*public void multiplerole()
  {
	  driver.findElement(By.xpath("//*[@id=\"utility-bar\"]/div[2]/div[3]/a")).click();
  }
public void selectrole() throws InterruptedException
{
	Select user = new Select ( driver.findElement(By.xpath("//*[@id=\"user-select\"]")));
	 user.selectByVisibleText("Student");
	 Thread.sleep(2000);
	 }

public void clickpopup()
{
	driver.findElement(By.xpath("//*[@id=\"utilitybar-modal-div\"]/div/div[3]/button")).click();
}*/
public void quit() throws InterruptedException {

	driver.quit();
	
}
}
