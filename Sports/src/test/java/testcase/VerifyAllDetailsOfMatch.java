package testcase;

import org.testng.annotations.Test;


import browserImplementation.Browser_Launch;
import pages.DetailsOfMatch;
import takeScreenShot.ScreenShot;

import org.testng.annotations.BeforeSuite;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

public class VerifyAllDetailsOfMatch {
	Browser_Launch bl;
	WebDriver driver=null;
  @Test
  public void verifyTheDetailsOfChart() throws Exception {
	  DetailsOfMatch dm=new DetailsOfMatch(driver);
	  for(int i=1;i<=10;i++) {
		  dm.teamName(i);
		  dm.pld(i);
		  dm.won(i);
		  dm.lost(i);
		  dm.tied(i);
		  dm.nr(i);
		  dm.netRR(i);
		  dm.For(i);
		  dm.against(i);
		  dm.pts(i);
		  dm.fromLostWin(i);
		  Reporter.log("///");
		  System.out.println();
	  }
	  ScreenShot ss=new ScreenShot(driver);
	  ss.getScreenShot("IPLChart");
  }
  @BeforeSuite
  public void beforeSuite() throws Exception {
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
  public void closeBrowser() {
	  driver.quit();
	  
  }

}
