package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class login {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://realtimeuat.industowers.com/login");
        driver.findElement(By.id(":r0:")).sendKeys("Admin");
        driver.findElement(By.id(":r1:")).sendKeys("Sonu-1998");
        driver.findElement(By.cssSelector(".css-1b7vft8-button")).click();


        WebElement title = driver.findElement(By.cssSelector(".css-17tm80"));
        String actualtitle = title.getText();

        String Expectedtitle = "Welcome to Grafana";
        if (actualtitle.equals(Expectedtitle)) {
            System.out.println("The Heading value are " + actualtitle);
        } else {
            System.out.println("The Heading Values are Not Matching" + Expectedtitle);
        }

    }

}
