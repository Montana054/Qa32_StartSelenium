import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
@Test
    public void startPhoneBook(){

        wd= new ChromeDriver();
     //   wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");

     wd.manage().window().maximize();

    List<WebElement> elements = wd.findElements(By.tagName("a"));
    WebElement login =elements.get(2);
    login.click();
WebElement element = wd.findElement(By.id("root"));
WebElement element1 =wd.findElement(By.className("container"));

//wd.findElement(By.id());
//wd.findElement(By.className());


        //wd.quit();

    }
    @Test
public  void home()
{

            wd= new ChromeDriver();
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    wd.manage().window().maximize();

//  wd.findElement(By.tagName("viewport"));
   WebElement el1=wd.findElement(By.tagName("body"));
    WebElement el2=wd.findElement(By.tagName("div"));
    WebElement el3=wd.findElement(By.tagName("a"));
    WebElement el4=wd.findElement(By.tagName("input"));
    WebElement el5=wd.findElement(By.tagName("br"));
    WebElement el6=wd.findElement(By.tagName("button"));

    WebElement el10=wd.findElement(By.id("root"));

WebElement el15=wd.findElement(By.className("navbar-component_nav__1X_4m"));
WebElement el16=wd.findElement(By.className("login_login__3EHKB"));
WebElement el17=wd.findElement(By.className("container"));
WebElement el18=wd.findElement(By.className("active"));
wd.quit();
}
@Test
    public void cssLocatorsTest()
{
    wd = new ChromeDriver();
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    wd.manage().window().maximize();

    wd.findElement(By.cssSelector(".login_login__3EHKB"));// для атрибута класс
    wd.findElement(By.cssSelector("#root"));// для id
    wd.findElement(By.cssSelector("[href='/login']"));// по атрибуту
    wd.findElement(By.cssSelector("[placeholder*='Password']"));// по атрибуту
}

}
