package org.testng;

import org.base.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A extends Base{
@Parameters("browser")
@Test
private void tc1(String browser) {
	launchBrowser(browser);
	driver.get(" http://www.greenstechnologys.com/");

}
}
