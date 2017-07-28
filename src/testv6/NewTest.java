package testv6;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	/*
	  private WebDriver driver;
	    private String baseUrl;
	    private boolean acceptNextAlert = true;
	    private StringBuffer verificationErrors = new StringBuffer();

	    
	    @BeforeMethod
		@BeforeClass(alwaysRun = true)
	   public void setUp() throws Exception {
	      driver = new FirefoxDriver();
	      baseUrl = "https://www.google.pl/";
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }*/
@Test
public void a() {
	
	System.out.println("dd");
	   assertEquals(0, 1);
}
/*	
  @Test
  public void f() {  
		      driver.get(baseUrl + "/search?client=ubuntu&channel=fs&q=fdgf&ie=utf-8&oe=utf-8&gfe_rd=cr&ei=mUt4Wda8OI_c8Af477vgCA");
	      driver.findElement(By.linkText("FDGF - What does FDGF stand for? The Free Dictionary")).click();
	      driver.findElement(By.cssSelector("input[type=\"text\"]")).click();
	      driver.findElement(By.xpath("//nav[@id='nav']/ul/li[8]/a/span")).click();
	  

  }

	    @AfterMethod
		@AfterClass(alwaysRun = true)
	    public void tearDown() throws Exception {
	      driver.quit();
	      String verificationErrorString = verificationErrors.toString();
	      if (!"".equals(verificationErrorString)) {
	        Assert.fail(verificationErrorString);
	      }
	    }

	    private boolean isElementPresent(By by) {
	      try {
	        driver.findElement(by);
	        return true;
	      } catch (NoSuchElementException e) {
	        return false;
	      }
	    }

	    private boolean isAlertPresent() {
	      try {
	        driver.switchTo().alert();
	        return true;
	      } catch (NoAlertPresentException e) {
	        return false;
	      }
	    }

	    private String closeAlertAndGetItsText() {
	      try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        if (acceptNextAlert) {
	          alert.accept();
	        } else {
	          alert.dismiss();
	        }
	        return alertText;
	      } finally {
	        acceptNextAlert = true;
	      }
	    }*/
	  

}
