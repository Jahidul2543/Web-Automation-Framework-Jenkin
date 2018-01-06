package home;

import base.CommonAPI;

public class HomePage extends CommonAPI {
    public void homePage(){
        System.out.println("You are in " + driver.getTitle() +" web page");
      findElementById("twotabsearchtextbox", "books");
    }
}
