package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import excelUtility.ExcelReader;

public class DetailsOfMatch {
	WebDriver driver;
	
	public DetailsOfMatch(WebDriver driver) throws Exception {  // Parameterized Constructor
		this.driver=driver;
	}
	public void teamName(int teamNumber) {
		String team1=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[2]/div/h2")).getText();
		System.out.print("Team Name ->"+team1+" ");
		Reporter.log("Team Name ->"+team1);
	}
	public void pld(int teamNumber) {
		String pld=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[3]")).getText();
		System.out.print(" Pld->"+pld+" ");
		Reporter.log(" Pld->"+pld);
	}
	public void won(int teamNumber) {
		String won=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[4]")).getText();
		System.out.print(" Won->"+won+" ");
		Reporter.log(" Won->"+won);
	}
	public void lost(int teamNumber) {
		String lost=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[5]")).getText();
		System.out.print(" Lost->"+lost+" ");
		Reporter.log(" Lost->"+lost);
	}
	public void tied(int teamNumber) {
		String tied=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[6]")).getText();
		System.out.print(" Tied->"+tied+" ");
		Reporter.log(" Tied->"+tied);
	}
	public void nr(int teamNumber) {
		String nr=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[7]")).getText();
		System.out.print(" N/R->"+nr+" ");
		Reporter.log(" N/R->"+nr);
	}
	public void netRR(int teamNumber) {
		String NetRR=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[8]")).getText();
		System.out.print(" NetRR->"+NetRR+" ");
		Reporter.log(" NetRR->"+NetRR);
	}
	public void For(int teamNumber) {
		String For=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[9]")).getText();
		System.out.print(" For->"+For+" ");
		Reporter.log(" For->"+For);
	}
	public void against(int teamNumber) {
		String against=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[10]")).getText();
		System.out.print(" Against->"+against+" ");
		Reporter.log(" Against->"+against);
	}
	public void pts(int teamNumber) {
		String pts=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[11]")).getText();
		System.out.print(" Pts->"+pts+" ");
		Reporter.log(" Pts->"+pts);
	}
	public void fromLostWin(int teamNumber) {
		int lost=0;
		int won=0;
		for (int i = 1; i <= 5; i++) {
			
		
		String s=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+teamNumber+"]/td[12]/div/span["+i+"]")).getText();
		System.out.print(s+" ");
		Reporter.log(s+" ");
		if(s.equalsIgnoreCase("L")) {
			lost++;
		}else {
			won++;
		}
		}
		System.out.println("Total Win->"+won+"  "+"Total Lost->"+lost);
		Reporter.log("Total Win->"+won+"  "+"Total Lost->"+lost);
		
	}

}
