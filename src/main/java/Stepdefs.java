import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.HashMap;

public class Stepdefs {
    WebDriver driver;
    HashMap<String,String> buttons = new HashMap<>();

    @Given("I have {int} cukes in my belly")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.format("ddd");
    }
    @Given("{word} open")
    public void openHomePage(String s)  throws java.lang.InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.taobao.com/");
    }

    @When("I enter {word} on search bar")
    public void enterText(String text) {
        driver.findElement(By.xpath("//div[@class=\"search-combobox-input-wrap\"]/input")).sendKeys(text);
    }

    @When("I click {word} button")
    public void clickButton(String buttonName) throws Exception{
        buttons.put("search","\"//button[@class=\\'btn-search tb-bg\\']\"");
        if (buttons.containsKey(buttonName)) {
            driver.findElement(By.xpath(buttons.get(buttonName))).click();
        }
        else {
            throw new Exception("Button " + buttonName + "'s xpath is not defined");
        }

    }
}


