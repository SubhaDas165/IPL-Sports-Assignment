package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class GeneralizeConsecutive {
	WebDriver driver;
	public GeneralizeConsecutive(WebDriver driver) {
		this.driver=driver;
	}
	public void consecutiveLossesWins(int team) {
		char array[]=new char[5];
		int cl=1;
		int cw=1;
		for (int i = 1; i <=5; i++) {
			String s=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[12]/div/span["+i+"]")).getText();
			array[i-1]=s.charAt(0);
		}
		for (int i = 0; i < array.length-1; i++) {
			char s=array[i];
			char s2=array[i+1];
			if(s==s2 && s=='L') {
				cl++;
			}
			if(s==s2 && s=='W') {
				cw++;
			}

		}
		
		if(cl>1) {
			String team1=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[2]/div/h2")).getText();
			System.out.print(" Consecutive losses: "+team1 +" ");
			Reporter.log(" Consecutive losses: "+team1 +" ");
		}
		if(cw>1) {
			String team1=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[2]/div/h2")).getText();
			System.out.print(" Consecutive win: "+team1 +" ");
			Reporter.log(" Consecutive win: "+team1 +" ");
		}
	}

}
