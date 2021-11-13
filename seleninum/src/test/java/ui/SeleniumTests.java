package ui;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/root-context.xml")
@Log4j
public class SeleniumTests {
	private final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private final String WEB_DRIVER_PATH = "chromedriver.exe";
	private String url = "https://www.naver.com";
	private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		driver = new ChromeDriver();
	}
	@Test
	public void crawl() throws InterruptedException {
		driver.get(url);
		log.info(driver);
	}
	static By select(String selector) {
		return By.cssSelector(selector);
	}
}
