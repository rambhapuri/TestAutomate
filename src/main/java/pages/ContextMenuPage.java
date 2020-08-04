package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextMenuArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickRightButton(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextMenuArea)).perform();
    }

    public String getContextMenuText(){
        return driver.switchTo().alert().getText();
    }

    public void clickAcceptButton(){
        driver.switchTo().alert().accept();
    }
}
