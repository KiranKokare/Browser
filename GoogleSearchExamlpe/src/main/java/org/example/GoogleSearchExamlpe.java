package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchExamlpeKK {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver1", "C:\\RESOURCES\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver2", "C:\\Users\\LORDS\\Downloads\\Compressed\\chromedriver-win64_3\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        WebDriver driver2 = new EdgeDriver();

        driver1.get("https://www.google.com");
        driver2.get("https://www.google.com");

        WebElement searchBox1 = driver1.findElement(By.name("q"));
        searchBox1.sendKeys(new CharSequence[]{"Java Books"});
        searchBox1.submit();

        WebElement searchBox2 = driver2.findElement(By.name("q"));
        searchBox2.sendKeys(new CharSequence[]{"Java Books"});
        searchBox2.submit();


        //String searchText = searchBox.getAttribute("value");
        //System.out.println("Search text: " + searchText);

        driver1.close();
        driver2.close();
    }
}