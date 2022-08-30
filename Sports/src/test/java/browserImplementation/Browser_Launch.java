package browserImplementation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configUtility.ObjectReader;

public class Browser_Launch {
	ObjectReader obj;
	String CPath;
	String EPath;
	String FPath;
	String url;
	String Ckey;
	String Ekey;
	String Fkey;
	
	WebDriver driver;
	public Browser_Launch() throws Exception {
		// TODO Auto-generated constructor stub
		obj=new ObjectReader();
		Ckey=obj.getChromeKey();
		Ekey=obj.getEdgeKey();
		Fkey=obj.getFFKey();
		url=obj.getBaseURL();
		CPath=obj.getChromePath();
		EPath=obj.getEdgePath();
		FPath=obj.getFFPath();
		System.setProperty(Ckey, CPath);
		System.setProperty(Ekey, EPath);
		System.setProperty(Fkey, FPath);
		
	}
	public WebDriver launch_Chrome() {
		driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	public WebDriver launch_Edge() {
		driver=new EdgeDriver();
		driver.get(url);
		return driver;
	}
	public WebDriver launch_FireFox() {
		driver=new FirefoxDriver();
		driver.get(url);
		return driver;
	}
	

}
