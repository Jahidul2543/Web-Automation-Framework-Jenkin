package home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchMenu extends HomePage {
    @Test
    public void searchOption(){
        System.out.println("*********Test starts here********");

        HomePage hm = new HomePage();
        hm.homePage();

    }
}
