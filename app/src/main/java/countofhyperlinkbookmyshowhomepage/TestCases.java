package countofhyperlinkbookmyshowhomepage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCases {
    public void endTest(WebDriver driver)
    {
        System.out.println("End Test: TestCases");
        driver.quit();

    }

    public  void testCase01(WebDriver driver) throws InterruptedException{
        System.out.println("Start Test case: testCase01");

        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        List<WebElement> elements = new ArrayList<>();
        elements = driver.findElements(By.tagName("a"));
        Thread.sleep(2000);
        System.out.println("Total count of links : " + elements.size());

        System.out.println("End Test case: testCase01");
    }


}
