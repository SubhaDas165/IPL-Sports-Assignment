package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AveragePointsFilterTeams {
	
	WebDriver driver;
	public AveragePointsFilterTeams(WebDriver driver) {
		this.driver=driver;
	}
	int sumloss=0;
	int sumwin=0;
	int countloss=0;
	int countwin=0;
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
//			System.out.print(" Consecutive losses: "+team1 +" ");
//			Reporter.log(" Consecutive losses: "+team1 +" ");
			String pts=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[11]")).getText();

			sumloss=sumloss+ Integer.parseInt(pts);
			countloss=countloss+1;
		}
		if(cw>1) {
			String team1=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[2]/div/h2")).getText();
//			System.out.print(" Consecutive win: "+team1 +" ");
//			Reporter.log(" Consecutive win: "+team1 +" ");
			String pts=driver.findElement(By.xpath("//*[@id=\"pointsdata\"]/tr["+team+"]/td[11]")).getText();
			sumwin=sumwin+Integer.parseInt(pts);
			countwin=countwin+1;

		}
	
		System.out.println("Average points of consecutive loss"+(double)sumloss/countloss);
		Reporter.log("Average points of consecutive loss"+(double)sumloss/countloss);
		System.out.println("Average points of consecutive win"+(double)sumwin/countwin);
		Reporter.log("Average points of consecutive win"+(double)sumwin/countwin);
	}

}
