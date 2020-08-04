package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {

    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public WYSIWYGPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameId);
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void decreseIndent(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String value = driver.findElement(textArea).getText();
        switchToMainArea();
        return value;
    }
}
