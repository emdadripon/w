package pagestests;

import CommonApi.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleTests extends base {

    @Test(enabled = true)
    public void WindowHandleTest() throws InterruptedException {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(3000);

        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()){
            String ChildWindow = iterator.next();

            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)){
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is:" + text.getText());

            }
        }



    }
}
