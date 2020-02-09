package Org.WiniumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator 
{
    public static void main( String[] args ) throws InterruptedException, MalformedURLException
    {
      DesktopOptions option=new DesktopOptions();
      
      option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
      Thread.sleep(5000);
      WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
      Thread.sleep(5000);
      driver.findElement(By.id("num7Button")).click(); 
    
      driver.findElementByName("Multiply by").click();

      driver.findElement(By.id("num5Button")).click();
      driver.findElement(By.name("Three")).click();
      driver.findElementById("equalButton").click();
      
    }
}
