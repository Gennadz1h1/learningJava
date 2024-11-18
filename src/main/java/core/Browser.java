package core;

import constans.Credentials;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Browser {
    private WebDriver driver;
    private WebDriverWait wait;
    Credentials credentials = new Credentials();


    @BeforeEach
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        //chromeOptions.addArguments("--headless");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(credentials.baseURL);

    }


        @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public Browser click(By locator) {
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        signInButton.click();
        return this;
    }

    public Browser click(WebElement element) {
        element.click();
        return this;
    }

    public Browser sendKeys(By locator, String value) {
        WebElement element = this.waitForElementToBeVisible(locator);
        element.sendKeys(value);
        return this;
    }

    public String takeText(By locator) {
        WebElement webElement = waitForElementToBeVisible(locator);
        return webElement.getText();
    }

    public List<String> takeTextFromAllElements(By list) {
        WebElement webElement = waitForElementToBeVisible(list);
        List<WebElement> elements = webElement.findElements(list);
        List<String> texts = elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return texts;
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
