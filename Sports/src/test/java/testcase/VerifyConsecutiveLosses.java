package testcase;

import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import pages.ConsecutiveLossesTeam;

import org.testng.annotations.BeforeSuite;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class VerifyConsecutiveLosses {
	Browser_Launch bl;
	WebDriver driver=null;
  @Test
  public void verifyConsecutive() {
	  ConsecutiveLossesTeam ls=new ConsecutiveLossesTeam(driver);
	  for (int i = 1; i <= 10; i++) {
		ls.consecutiveLosses(i);
	}
  }
  @BeforeSuite
  public void launch_Browser() throws Exception {
	  Scanner sc= new Scanner(System.in);
		bl=new Browser_Launch();
		System.out.println("Enetr 1 for Chrome Browser");
		System.out.println("Enetr 2 for Edge Browser");
		System.out.println("Enetr 3 for Firefox Browser");
		int n=sc.nextInt();
		if(n==1) {
			driver=bl.launch_Chrome();
		}
		if(n==2) {
			driver=bl.launch_Edge();
		}
		if(n==3) {
			driver=bl.launch_FireFox();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/button")).click();
  }

  @AfterSuite
  public void close_Browser() {
	  driver.quit();
  }

}
