package home;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetMenusTest extends GetMenus  {
    @Test
    public void getDropDownTest(){
        List<String> expected = getMenu();
        List<String> actual = getMenu();

        Assert.assertEquals(expected, actual);

    }
}
