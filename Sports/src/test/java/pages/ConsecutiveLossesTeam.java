package pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ConsecutiveLossesTeam {
	WebDriver driver;
	public ConsecutiveLossesTeam(WebDriver driver) {
		this.driver=driver;
	}
	public void consecutiveLosses(int team) {
		char array[]=new char[5];
		int c=0;
		for (int i = 1; i <=5; i++) {
			String s=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[12]/div/span["+i+"]")).getText();
			array[i-1]=s.charAt(0);
		}
		for (int i = 0; i < array.length-1; i++) {
			char s=array[i];
			char s2=array[i+1];
			if(s==s2 && s=='L') {
				c++;
			}

		}
		
		if(c>0) {
			String team1=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[2]/div/h2")).getText();
			System.out.print("Two Consecutive losses: "+team1 +" ");
			Reporter.log("Two Consecutive losses: "+team1 +" ");
		}
	}

}
