package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GetMenus extends CommonAPI {
     public List<String> getMenu(){
         List<String > dropDownMenuAll = new ArrayList<String>();
         dropDownMenuAll = getTextFromWebElements("#searchDropdownBox option");
          return dropDownMenuAll;
     }


}
