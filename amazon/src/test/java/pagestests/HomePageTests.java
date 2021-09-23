package pagestests;

import CommonApi.base;
import org.testng.annotations.Test;

public class HomePageTests extends base {

    @Test
    public void searchItems(){
        System.out.println(driver.getPageSource());
    }
}
