package runTestDDTMVN;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Run {

		
		static void runTest(String strSearchString, String strPageTitle) {
			// TODO Auto-generated method stub
			// Start a browser driver and navigate to Google
			
		
	        System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\davidbro\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	 
	        // Enter the search string and send it
	        WebElement element = driver.findElement(By.name("q"));
	        element.sendKeys(strSearchString);
	        element.submit();
	         
	        // Check the title of the page
	        if (driver.getTitle().equals(strPageTitle)) {
	            System.out.println("Page title is " + strPageTitle + ", as expected");
	        } else {
	            System.out.println("Expected page title was " + strPageTitle + ", but was " + driver.getTitle() + " instead");
	        }
	         
	        //Close the browser
	        driver.quit();
		}
		
	}