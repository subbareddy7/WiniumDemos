package Org.WiniumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Pdf {

	public static void main(String[] args) throws MalformedURLException {
		DesktopOptions opt=new DesktopOptions();
		opt.setApplicationPath("D:\\sample.pdf");
		WiniumDriver driv=new WiniumDriver(new URL("http://localhost:9999"), opt);
	
	}

}
