package Org.WiniumTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class TeamViewer {

	public static void main(String[] args) throws IOException, InterruptedException {
		DesktopOptions option=new DesktopOptions();
		/*option = new DesktopOptions();
		option.setApplicationPath("C:\\Program Files (x86)\\TeamViewer\\TeamViewer.exe");
		File driverPath = new File("E:\\WiniumSpy\\Winium.Desktop.Driver.exe");
		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		WiniumDriver driver=new WiniumDriver(service, option);*/
		
		option.setApplicationPath("C:\\Program Files (x86)\\TeamViewer\\TeamViewer.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
		driver.findElement(By.id("1001")).sendKeys("703545449088");
		driver.findElement(By.id("1590")).click();	
		driver.findElementByName("Connect").click();
		/*driver.findElementByName("Chat").click();
		driver.findElementByName("E-mail").sendKeys("Test@tes.com");
		driver.findElementByName("Password").sendKeys("Test@tes.com");
		driver.findElement(By.id("3")).click();*/
	}

}
